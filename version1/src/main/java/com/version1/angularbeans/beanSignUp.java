package com.version1.angularbeans;
import javax.inject.Inject;

import com.version1.model.ModelRequestUp;
import com.version1.service.UserEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class beanSignUp {
	
	@Inject          
	ModelQuery modelQuery;
	
	@Inject
	UserEntityService userEntityService;
	
	@NGPostConstruct
	public void init(){
		modelQuery.setProperty("user", new ModelRequestUp());
	}
	
	@Get
	@NGReturn(model = "msgUserAdd")
	public String addUserBean(ModelRequestUp modelRequestUp){
		
		return userEntityService.addUserService(modelRequestUp);
	}
	
	
	
	
	
	
}
