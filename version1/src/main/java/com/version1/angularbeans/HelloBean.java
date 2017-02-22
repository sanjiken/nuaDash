package com.version1.angularbeans;
import javax.inject.Inject;

import com.version1.model.UserModelRequest;
import com.version1.model.UserModelResult;
import com.version1.service.UserEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGModel;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.NGSubmit;
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
		modelQuery.setProperty("user", new UserModelRequest());
	}
	
	@Get
	@NGReturn(model = "msgUserAdd")
	public String addUserBean(UserModelRequest userModelRequest){
		
		return userEntityService.addUserService(userModelRequest);
	}
	
	
	@Get
	@NGReturn(model = "userResult")
	public UserModelResult searchUserBean(String email){
		
		return userEntityService.searchUserService(email);
	}

	private String message;
	private String name = "insert your name here";

	@Get
	@NGSubmit(backEndModels = "name")
	@NGReturn(updates = "message")
	public void sayHello() {
		message = "Hello " + name + "from angularBeans !";
	}

	@NGModel
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@NGModel
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}