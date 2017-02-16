package com.version1.angularbeans;
import angularBeans.api.http.Get;

import angularBeans.api.AngularBean;
import angularBeans.api.NGModel;
import angularBeans.api.NGReturn;
import angularBeans.api.NGSubmit;

@AngularBean
public class HelloBean {

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