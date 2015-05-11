package com.mobilekipyonetim.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;

import com.liferay.faces.util.portal.WebKeys;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.mobilekipyonetim.service.model.Branch;
import com.mobilekipyonetim.service.model.impl.BranchImpl;
import com.mobilekipyonetim.service.service.BranchLocalServiceUtil;
import com.mobilekipyonetim.service.service.persistence.BranchUtil;

@ManagedBean(name="branchController")
@SessionScoped
public class BranchController {

	private static Logger LOGGER =Logger.getLogger(BranchController.class);
	
	Branch branch = new BranchImpl();
	List<Branch> branchList = new ArrayList<Branch>();
	
	String name;
		
	public BranchController() {
		super();
		reset();

	}
	
	public void reset(){
		 branch = new BranchImpl();
		
	}
	
	
	
	
	
	public void create(){
		try{
					
			//getServiceProvider().getPersistanceService().saveOrUpdate(branch);
			long[] orgIdList = getUser().getOrganizationIds();
			branch.setOrganizationId(orgIdList[0]);
			BranchLocalServiceUtil.updateBranch(branch);
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
	
	private User getUser() {
		  return getThemeDisplay().getUser();
		}
		
		public ThemeDisplay getThemeDisplay(){
			return (ThemeDisplay)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(WebKeys.THEME_DISPLAY);
		}
	

	public void delete(){
		try{
			//getServiceProvider().getPersistanceService().deleteBranch(branch);
			BranchLocalServiceUtil.deleteBranch(branch);
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
			//branchList = getServiceProvider().getPersistanceService().searchBranch(name);
			//branchList.get(0).getVehicleList().isEmpty();
//			DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(Branch.class);
//
//			dyQuery.add(RestrictionsFactoryUtil.ilike("name", name));
//			branchList =BranchLocalServiceUtil.dynamicQuery(dyQuery);
			
			long[] orgIdList = getUser().getOrganizationIds();
			int i = (int)(orgIdList[0]);
			branchList.clear();
			branchList.addAll(BranchLocalServiceUtil.getBranchByNameAndOrganization("%"+name+"%",i));
//			branchList = BranchUtil.findByn(name);
		}catch(Exception e){
			FacesContext.getCurrentInstance().addMessage(null , new FacesMessage(FacesMessage.SEVERITY_ERROR,"Hata oluştu",""));
			LOGGER.error("Hata Olutu:"+ e.getMessage()  , e);
		}
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public List<Branch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
