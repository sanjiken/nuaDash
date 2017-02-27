package com.version1.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.version1.entity.UserEntity;
import com.version1.model.ModelRequestIn;
import com.version1.model.ModelRequestUp;
import com.version1.model.ModelResultIn;

@LocalBean
@Stateless
public class UserEntityService {

	/**
	 * Entity manager injected
	 */
	@PersistenceContext
	EntityManager em;
	
	public String addUserService(ModelRequestUp userRequest){
		
		String isSucces = "succes" ;
		
		if (userRequest != null) {
			
			try {
				UserEntity user = new UserEntity();
				user.setUserName(userRequest.getUserName());
				user.setConfPassword(userRequest.getConfPassword());
				user.setPassword(userRequest.getPassword());
				user.setEmail(userRequest.getEmail());
			
				
				em.persist(user);
			} catch (Exception e) {
				e.printStackTrace();
				isSucces = "error";
			}
		}else{
			isSucces = "user request null";
		}
		
		
		
		
		return isSucces;
	}
	
	


	public ModelResultIn searchUserService(ModelRequestIn user){
		
		System.out.println("this is the mail from service : " + user.getEmail());
		System.out.println("this is the password from service : " + user.getPassword());

		try {
			
			Query query = em.createQuery(" SELECT new com.version1.model.ModelResultIn(  "
						+ " u.id ,      "
						+ " u.userName, "
						+ " u.email )   "
					   + " FROM UserEntity u   "
					   + " WHERE u.email = :p1 and u.password= :p2 ")
				.setParameter("p1", user.getEmail())
				.setParameter("p2", user.getPassword());
				
			ModelResultIn userResult = new ModelResultIn();
			
			userResult = (ModelResultIn) query.getSingleResult();
				return userResult;
			
		} catch (Exception e) {
			return null;
		}
		
}
	
}

