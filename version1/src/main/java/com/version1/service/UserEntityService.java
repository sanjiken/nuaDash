package com.version1.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.version1.entity.UserEntity;
import com.version1.model.AuthentificationRequest;
import com.version1.model.UserModelRequest;
import com.version1.model.UserModelResult;

@LocalBean
@Stateless
public class UserEntityService {

	/**
	 * Entity manager injected
	 */
	@PersistenceContext
	EntityManager em;
	
	public String addUserService(UserModelRequest userRequest){
		
		String isSucces = "succes" ;
		
		try {
			UserEntity user = new UserEntity();
			user.setFirstName(userRequest.getFirstName());
			user.setLastName(userRequest.getLastName());
			user.setPassword(userRequest.getPassword());
			user.setEmail(userRequest.getEmail());
			user.setIsHomme(userRequest.getIsHomme());
			user.setIsFemme(true);
			
			em.persist(user);
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
		
		
		
		return isSucces;
	}
	
	


	public UserModelResult searchUserService(AuthentificationRequest user){
		
		System.out.println("this is the mail from service : " + user.getMail());
		System.out.println("this is the password from service : " + user.getPassword());
		try {
			
			Query query = em.createQuery(" SELECT new com.version1.model.UserModelResult(  "
						+ " u.firstName,        "
						+ " u.lastName,         "
						+ " u.password,         "
						+ " u.email,            "
						+ " u.isHomme,        "
						+ " u.isFemme  )   "
					   + " FROM UserEntity u   "
					   + " WHERE u.email = :p1 and u.password= :p2 ")
				.setParameter("p1", user.getMail())
				.setParameter("p2", user.getPassword());
				
			UserModelResult userResult = new UserModelResult();
				
			userResult = (UserModelResult) query.getSingleResult();
				return userResult;
			
		} catch (Exception e) {
			return null;
		}
		
}
	
}

