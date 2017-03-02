package com.version1.angularbeans;

import javax.inject.Inject;

import com.version1.model.UserModelRequestAdd;
import com.version1.model.UserModelRequestCnx;
import com.version1.model.UserModelResultCnx;
import com.version1.service.UserEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanUser {

	@Inject
	ModelQuery modelQuery;

	@Inject
	UserEntityService UserEntityService;

	@NGPostConstruct
	public void init() {
		modelQuery.setProperty("userCnx", new UserModelRequestCnx())
		          .setProperty("user", new UserModelRequestAdd());
	}
	
	
	@Get
	@NGReturn(model = "resUserSearsh")
	public String userSearsh(UserModelRequestCnx userC ){
		return UserEntityService.searchService(userC);
	}
	
	@Get
	@NGReturn(model = "userConnected")
	public UserModelResultCnx getUserConnected(UserModelRequestCnx userC){
    
			 return UserEntityService.searchUserService(userC);
	
	}

	@Get
	@NGReturn(model = "userResult")
	public UserModelResultCnx searchUserBean(UserModelRequestCnx userCnx) {

		System.out.println("this is the mail from bean : " + userCnx.getEmail());
		System.out.println("this is the password from bean : " + userCnx.getPassword());

		return UserEntityService.searchUserService(userCnx);
	}

	@Get
	@NGReturn(model = "msgUserAdd")
	public String addUserBean(UserModelRequestAdd UserModelRequestAdd) {

		return UserEntityService.addUserService(UserModelRequestAdd);
	}
	

}
