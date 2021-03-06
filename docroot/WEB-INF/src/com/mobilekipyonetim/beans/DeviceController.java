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

import com.mobilekipyonetim.service.model.Device;
import com.mobilekipyonetim.service.model.impl.DeviceImpl;
import com.mobilekipyonetim.service.service.DeviceLocalServiceUtil;



@ManagedBean(name="deviceController")
@SessionScoped
public class DeviceController extends BaseController{

	private static Logger LOGGER =Logger.getLogger(DeviceController.class);
	
	Device device = new DeviceImpl();
	List<Device> deviceList = new ArrayList<Device>();
	
	String msisdn;
	Map<String,Long> vehicleOptions = new HashMap<String,Long>();
	
	public DeviceController() {
		super();

	}
	
	public void reset(){
		device = new DeviceImpl();
	}
	
	
	
	
	
	public void createDevice(){
		try{
					
			//getServiceProvider().getPersistanceService().saveOrUpdate(device);
			device.setOrganizationId(subOrganizationId);
			DeviceLocalServiceUtil.updateDevice(device);
			
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_INFO,"Isleminiz tamamlamnd,",""));
			device = new DeviceImpl();	
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
	
	
	

	public void deleteDevice(){
		try{
			//getServiceProvider().getPersistanceService().deleteDevice(device);
			DeviceLocalServiceUtil.deleteDevice(device);
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_INFO,"Isleminiz tamamlamnd,",""));
			device = new DeviceImpl();	
			search();
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
	}
	
	
	public void search(){
		try{
			//deviceList = getServiceProvider().getPersistanceService().searchDevice(msisdn);
			deviceList = DeviceLocalServiceUtil.getDeviceByImeiAndOrganization("%"+msisdn+"%", Integer.parseInt(subOrganizationId.toString()));
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
	}
	
	public Map<String,Long> prepareVehicleList(){
		Map<String,Long> map = new HashMap<String,Long>();
		try{
//			
//			
//			List<Vehicle> vehicleList = getServiceProvider().getPersistanceService().getVechiles();
//			for (Iterator iterator = vehicleList.iterator(); iterator.hasNext();) {
//				Vehicle vehicle = (Vehicle) iterator.next();
//				map.put(vehicle.getPlate(),vehicle.getId());
//				
//			}
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
		return map;
	}

	

	public Device getDevice() {
		return device;
	}







	public void setDevice(Device device) {
		this.device = device;
	}







	public List<Device> getDeviceList() {
		return deviceList;
	}







	public void setDeviceList(List<Device> deviceList) {
		this.deviceList = deviceList;
	}







	public String getMsisdn() {
		return msisdn;
	}







	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}







	public Map<String,Long> getVehicleOptions() {
		//if(vehicleOptions.size()==0){
			vehicleOptions = prepareVehicleList();
		//}
		
		return vehicleOptions;
	}







	public void setVehicleOptions(Map<String,Long> vehicleOptions) {
		this.vehicleOptions = vehicleOptions;
	}
	
	
	


}
