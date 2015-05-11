package com.mobilekipyonetim.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.liferay.faces.util.portal.WebKeys;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.User;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.mobilekipyonetim.service.model.Vehicle;
import com.mobilekipyonetim.service.service.VehicleLocalServiceUtil;

public class BaseController {

	String blueDot = "http://maps.google.com/mapfiles/ms/micons/blue-dot.png";
	public boolean isAdmin;                      

	
	Map<String,Long> organizationList ;
	Map<String,Long> subOrganizationList = new HashMap<String, Long>();
	Map<String,Long> vehicleList = new HashMap<String, Long>();
	Long firmId;
	Long subOrganizationId;
	Long vehicleId;
	
	
	
	public BaseController() {
		super();
		// TODO Auto-generated constructor stub
		
		organizationList = prepareFirmList();
		subOrganizationList = prepareSubOrganizationList(firmId);
		vehicleList = prepareVehicleList(subOrganizationId);
	
	}

	public int getOrganizationId(User user) throws Exception{
		long[] orgIdList = user.getOrganizationIds();
		int i = (int)(orgIdList[0]);
		
		return i;
	}
	
	public long getOrganizationId(FacesContext facesContext) throws Exception{
		User user = getUser(facesContext);
		long[] orgIdList = user.getOrganizationIds();
		return orgIdList[0];
		
	}
	
	public Organization getOrganization(User user) throws Exception{
		long orgId = getOrganizationId(user);
		Organization orgList  = OrganizationLocalServiceUtil.getOrganization(orgId);
		return orgList;
	}
	
	public List<Organization> getSubOrganizations(long companyId,long orgId) throws Exception{
		List<Organization> orgList  = OrganizationLocalServiceUtil.getSuborganizations(companyId,orgId);
		return orgList;
	}
	
	public List<Organization> getFirmList(FacesContext facesContext) throws Exception{
		List<Organization> list = new ArrayList<Organization>();
		User user = getUser(facesContext); // admin ise tüm firmalari göster
		list.add(getOrganization(user));
		
		return list; 
	}
	
	public long getCompanyId(FacesContext facesContext){
		return getThemeDisplay(facesContext).getCompanyId();
	}
	
	public User getUser(FacesContext facesContext) {
		  return getThemeDisplay(facesContext).getUser();   
		}
		
		public ThemeDisplay getThemeDisplay(FacesContext facesContext){
			return (ThemeDisplay)facesContext.getExternalContext().getRequestMap().get(WebKeys.THEME_DISPLAY);
		}

		public boolean isAdmin() {
			return isAdmin;
		}

		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}
		
		public Map<String,Long> prepareFirmList() {
			
			
			Map<String,Long> map = new HashMap<String,Long>();
			try{
				List<Organization> orgList = getFirmList(FacesContext.getCurrentInstance());
				firmId= orgList.get(0).getPrimaryKey();
				
				for (Iterator iterator = orgList.iterator(); iterator.hasNext();) {
					Organization device = (Organization) iterator.next();
					map.put(device.getName(),device.getPrimaryKey());
					
					
				
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return map;
			
		}
		
		public Map<String,Long> prepareSubOrganizationList(long firmId){
			Map<String,Long> map = new HashMap<String,Long>();
			//map.put("Seciniz",new Long(-1));
			
			try{
				
				
//				List<Branch> vehicleList = getServiceProvider().getPersistanceService().getBranchList();
				long companyId = getCompanyId(FacesContext.getCurrentInstance());
				List<Organization> orgList = getSubOrganizations(companyId, firmId);
				subOrganizationId = orgList.get(0).getPrimaryKey();
				for (Iterator iterator = orgList.iterator(); iterator.hasNext();) {
					Organization device = (Organization) iterator.next();
					map.put(device.getName(),device.getPrimaryKey());
				}
				
			}catch(Exception e){
				FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluÅŸtu",""));
				//LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
			}
			return map;
		}
		
		public Map<String,Long> prepareVehicleList(long firmId){
			Map<String,Long> map = new HashMap<String,Long>();
			map.put("Seciniz",new Long(-1));
			try{
				
				
//				List<Branch> vehicleList = getServiceProvider().getPersistanceService().getBranchList();
				long companyId = getCompanyId(FacesContext.getCurrentInstance());
				//List<Organization> orgList = getSubOrganizations(companyId, firmId);
				
				long[] id = new long[1];
				id[0] = firmId;
				List<Vehicle> list = VehicleLocalServiceUtil.getVehicleByOrganizationList(id);
				for (Iterator iterator = list.iterator(); iterator.hasNext();) {
					Vehicle device = (Vehicle) iterator.next();
					map.put(device.getPlate(),(long)device.getPrimaryKey());
				}
				
			}catch(Exception e){
				FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluÅŸtu",""));
				//LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
			}
			return map;
		}
		
		
		public void onFirmChange() {
	        if(firmId!= new Long(-1)){
	        	subOrganizationList.clear();
	        	subOrganizationList.putAll(prepareSubOrganizationList(firmId));
	        } 
	    }

		public void onSubOrganizationChange() {
	        if(subOrganizationId!= new Long(-1)){
	        	vehicleList.clear();
	        	vehicleList.putAll(prepareVehicleList(subOrganizationId));
	        } 
	    }
		
		public Map<String, Long> getOrganizationList() {
			
			return organizationList;
		}

		public void setOrganizationList(Map<String, Long> organizationList) {
			this.organizationList = organizationList;
		}

		public Map<String, Long> getSubOrganizationList() {
			return subOrganizationList;
		}

		public Long getFirmId() {
			return firmId;
		}

		public void setFirmId(Long firmId) {
			this.firmId = firmId;
		}

		public Long getSubOrganizationId() {
			return subOrganizationId;
		}

		public void setSubOrganizationId(Long subOrganizationId) {
			this.subOrganizationId = subOrganizationId;
		}

		public void setSubOrganizationList(Map<String, Long> subOrganizationList) {
			this.subOrganizationList = subOrganizationList;
		}

		public Map<String, Long> getVehicleList() {
			return vehicleList;
		}

		public void setVehicleList(Map<String, Long> vehicleList) {
			this.vehicleList = vehicleList;
		}

		public Long getVehicleId() {
			return vehicleId;
		}

		public void setVehicleId(Long vehicleId) {
			this.vehicleId = vehicleId;
		}

		
		

}
