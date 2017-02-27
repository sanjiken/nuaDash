package com.version1.angularbeans;
import javax.inject.Inject;

import com.version1.model.ModelRequestIn;
import com.version1.model.ModelResultIn;
import com.version1.service.UserEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class beanSignIn {
	
	@Inject          
	ModelQuery modelQuery;
	
	@Inject
	UserEntityService userEntityService;
	
	@NGPostConstruct
	public void init(){
		modelQuery.setProperty("user", new ModelRequestIn());
	}
	
	
	
	@Get
	@NGReturn(model = "userResult")
	public ModelResultIn searchUserBean(ModelRequestIn user){
		
		System.out.println("this is the mail from bean : " + user.getEmail());
		System.out.println("this is the password from bean : " + user.getPassword());
		
		return userEntityService.searchUserService(user);
	}

	
	
	
}
