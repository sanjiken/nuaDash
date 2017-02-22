package com.version1.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.version1.entity.UserEntity;
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
			user.setLogin(userRequest.getLogin());
			user.setPassword(userRequest.getPassword());
			user.setEmail(userRequest.getEmail());
			user.setIsActivated(userRequest.getIsActivated());
			user.setIsDeleted(true);
			
			em.persist(user);
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
		
		
		
		return isSucces;
	}
	
	
	public UserModelResult searchUserService(String email){
		
		// type de retoure est toute entité 
//		Query query = em.createQuery(" SELECT *  "
//								   + " FROM UserEntity u "
//								   + " WHERE u.email = :p1 ")
//				.setParameter("p1", email);
//		
//		UserEntity user = new UserEntity();
//		
//		user = (UserEntity) query.getSingleResult();
		
		try {
			
			// retoure avec un model
			Query query = em.createQuery(" SELECT new com.version1.model.UserModelResult(  "
						+ " u.firstName,        "
						+ " u.lastName,         "
						+ " u.login,            "
						+ " u.password,         "
						+ " u.email,            "
						+ " u.isDeleted,        "
						+ " u.isActivated  )   "
					   + " FROM UserEntity u   "
					   + " WHERE u.email = :p1 ")
				.setParameter("p1", email);
				
			UserModelResult user = new UserModelResult();
				
				user = (UserModelResult) query.getSingleResult();
				return user;
			
		} catch (Exception e) {
			return null;
		}
		
		
		
		
		
		
	}
	
}
