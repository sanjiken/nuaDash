package com.version1.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.version1.entity.UserEntity;
import com.version1.model.UserModelRequest;

@LocalBean
@Stateless
public class UserEntityService {

	/**
	 * Entity manager injected
	 */
	@PersistenceContext
	EntityManager em;
	
	public String addUser(UserModelRequest userRequest){
		
		String isSucces = "succes" ;
		
		try {
			UserEntity user = new UserEntity();
			user.setFirstName(userRequest.getFirstName());
			user.setLastName(userRequest.getLastName());
			user.setLogin(userRequest.getLogin());
			user.setPassword(userRequest.getPassword());
			user.setEmail(userRequest.getEmail());
			user.setIsActivated(userRequest.getIsActivated());
			user.setIsDeleted(userRequest.getIsDeleted());
			
			em.persist(user);
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
		
		
		
		return isSucces;
	}
	
}
