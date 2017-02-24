package com.version1.angularbeans;
import javax.inject.Inject;

import com.version1.model.AuthentificationRequest;
import com.version1.model.UserModelRequest;
import com.version1.model.UserModelResult;
import com.version1.service.UserEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class HelloBean {
	
	@Inject          
	ModelQuery modelQuery;
	
	@Inject
	UserEntityService userEntityService;
	
	@NGPostConstruct
	public void init(){
		modelQuery.setProperty("user", new AuthentificationRequest());
	}
	
	@Get
	@NGReturn(model = "msgUserAdd")
	public String addUserBean(UserModelRequest userModelRequest){
		
		return userEntityService.addUserService(userModelRequest);
	}
	
	
	@Get
	@NGReturn(model = "userResult")
	public UserModelResult searchUserBean(AuthentificationRequest user){
		
		System.out.println("this is the mail from bean : " + user.getMail());
		System.out.println("this is the password from bean : " + user.getPassword());
		
		return userEntityService.searchUserService(user);
	}

	
	
	
}
