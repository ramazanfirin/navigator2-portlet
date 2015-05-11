package com.mobilekipyonetim.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;

import com.liferay.portal.model.Organization;
import com.mobilekipyonetim.service.model.Branch;
import com.mobilekipyonetim.service.model.Device;
import com.mobilekipyonetim.service.model.Vehicle;
import com.mobilekipyonetim.service.model.impl.VehicleImpl;
import com.mobilekipyonetim.service.service.DeviceLocalServiceUtil;
import com.mobilekipyonetim.service.service.VehicleLocalServiceUtil;



@ManagedBean(name="vehicleController")
@SessionScoped
public class VehicleController extends BaseController{

	private static Logger LOGGER =Logger.getLogger(VehicleController.class);
	
	Vehicle vehicle = new VehicleImpl();
	List<Vehicle> vehicleResultList = new ArrayList<Vehicle>();
	
	String plate;
	Map<String,Long> deviceOptions = new HashMap<String,Long>();
	
//	Map<String,Long> branchOptions = new HashMap<String,Long>();
//	Map<String,Long> companyOptions = new HashMap<String,Long>();
//	
//	
//	public Long firmId;
//	public Long branchId;
	
	public VehicleController() {
		super();
		reset();
		
	}
	
	public void reset(){
		 vehicle = new VehicleImpl();
		 //vehicle.setDevice(new DeviceImpl());
		 //vehicle.set
		 
//		 prepareDeviceList();
//		 prepareFirmList();
//		 prepareBranchList();
	}
	
	
	
	
	
	public void create(){
		try{
					
			//getServiceProvider().getPersistanceService().saveOrUpdate(vehicle);
			VehicleLocalServiceUtil.updateVehicle(vehicle);
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_INFO,"Isleminiz tamamlamnd,",""));
			reset();	
			search();
			// send mail for password
			RequestContext.getCurrentInstance().execute("PF('createUser').hide()");
//			RequestContext.getCurrentInstance().update("dataGrid");
//			RequestContext.getCurrentInstance().update(":form1:dataGrid");
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
		
	}
	
	
	

	public void delete(){
		try{
			//getServiceProvider().getPersistanceService().deleteVehicle(vehicle);
			VehicleLocalServiceUtil.deleteVehicle(vehicle);
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_INFO,"Isleminiz tamamlamnd,",""));
			reset();	
			search();
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
	}
	
	
	public void search(){
		try{
			//vehicleList = getServiceProvider().getPersistanceService().searchVehicle(plate);
			
			List<Long> idList = new ArrayList<Long>();
			idList.add(firmId);
 			if(subOrganizationId!=-1)
				idList.add(subOrganizationId);
			else{
				long companyId = getCompanyId(FacesContext.getCurrentInstance());
				List<Organization> list =getSubOrganizations(companyId, firmId);
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					Organization organization = (Organization) iterator.next();
					idList.add(organization.getPrimaryKey());
				}
			
			}
			long[] idLongList = new long[idList.size()];
			for (int i = 0; i < idList.size(); i++) {
				idLongList[i]=idList.get(i);
			}
			
			vehicleResultList = VehicleLocalServiceUtil.getVehicleByPlateAndOrganizationList("%"+plate+"%", idLongList);
			//System.out.println(vehicleList.get(0).getBranch().getName());
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
	}
	
//	public void onFirmChange() {
//        if(firmId!= new Long(-1))
//        	prepareBranchList();
//        
//    }
	
	public void onSubOrganizationChange() {
		if(subOrganizationId!= new Long(-1)){
        	deviceOptions.clear();
        	deviceOptions.putAll(prepareVehicleList(subOrganizationId));
        } 
	}
     
	
	public Map<String,Long> prepareDeviceList(){
		Map<String,Long> map = new HashMap<String,Long>();
		try{
			
			
			//List<Device> vehicleList = getServiceProvider().getPersistanceService().getDevices();
			Long orgId = getOrganizationId(FacesContext.getCurrentInstance());
			List<Device> vehicleList = DeviceLocalServiceUtil.getDeviceByOrganization(orgId);
			for (Iterator iterator = vehicleList.iterator(); iterator.hasNext();) {
				Device device = (Device) iterator.next();
				map.put(device.getMsisdn(),(long)device.getPrimaryKey());
				
			}
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
		return map;
	}
	
	
	
	public Map<String,Long> prepareBranchList(){
		return super.prepareSubOrganizationList(firmId);
	}







	public Vehicle getVehicle() {
		return vehicle;
	}







	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}






//
//	public List<Vehicle> getVehicleList() {
//		return vehicleList;
//	}
//








	public String getPlate() {
		return plate;
	}







	public void setPlate(String plate) {
		this.plate = plate;
	}







	public Map<String, Long> getDeviceOptions() {
//		if(deviceOptions.size()==0){
		deviceOptions = prepareDeviceList();
//		}
		return deviceOptions;
	}







	
	public Long getFirmId() {
		return firmId;
	}

	public void setFirmId(Long firmId) {
		this.firmId = firmId;
	}

	public void setDeviceOptions(Map<String, Long> deviceOptions) {
		this.deviceOptions = deviceOptions;
	}

	public List<Vehicle> getVehicleResultList() {
		return vehicleResultList;
	}

	public void setVehicleResultList(List<Vehicle> vehicleResultList) {
		this.vehicleResultList = vehicleResultList;
	}




	

	


	


}
