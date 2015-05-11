package com.mobilekipyonetim.beans;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;


@ManagedBean
@SessionScoped
public class UserBean extends BaseController{
	List<User> users = new ArrayList<User>();
	
    
	
	public void getAllUsers() throws Exception{
  	  int userCount = UserLocalServiceUtil.getUsersCount();
  	  users = UserLocalServiceUtil.getUsers(0, userCount);
  	 //users.get(0).getFullName()
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static void main(String[] args) {
;
	}
}
