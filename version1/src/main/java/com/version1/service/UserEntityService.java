package com.version1.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.version1.entity.UserEntityy;
import com.version1.model.UserModelRequestAdd;
import com.version1.model.UserModelRequestCnx;
import com.version1.model.UserModelResultCnx;

@LocalBean
@Stateless
public class UserEntityService {


	@PersistenceContext
	EntityManager eem;
	
	
	
	public String searchService(UserModelRequestCnx userCnx){
		
		
		
		try {
			
			Query query = eem.createQuery(" SELECT new com.version1.model.UserModelRequestCnx(  "
					
					   + " u.email,"
					   + " u.password )   "
					   + " FROM UserEntityy u   "
					   + " WHERE u.email = :p1  ")
				.setParameter("p1", userCnx.getEmail());
				
			UserModelRequestCnx result = (UserModelRequestCnx) query.getSingleResult();
			
			
			
			        if(!userCnx.getPassword().equals(result.getPassword())){
			        	return "Password Not Correct";
			        	
			        }
			        else{
			        	return "Succes";
			        }
			    
			
		} catch (Exception e) {
			// TODO: handle exception
			return "UserNotFound";
		}
			
			
			
			
	}
	
	
	
	
	
	
	
	
	public String addUserService(UserModelRequestAdd userRequest){
		
		String isSucces = "succes" ;
		
		if (userRequest != null) {
			
			try {
				UserEntityy user = new UserEntityy();
				user.setUserName(userRequest.getUserName());
			
	            user.setPassword(userRequest.getPassword());
			
				user.setEmail(userRequest.getEmail());
				user.setIsActivate(false);
				
				eem.persist(user);
			} catch (Exception e) {
				e.printStackTrace();
				isSucces = "error";
			}
		}else{
			isSucces = "user request null";
		}
		
		
		return isSucces;
	
		
		     
		}
	
	
	


	public UserModelResultCnx searchUserService(UserModelRequestCnx user){
		
		System.out.println("this is the mail from service : " + user.getEmail());
		System.out.println("this is the password from service : " + user.getPassword());

		try {
			
			Query query = eem.createQuery(" SELECT new com.version1.model.UserModelResultCnx(  "
						+ " u.id ,      "
						+ " u.userName, "
						+ " u.email )   "
					   + " FROM UserEntityy u   "
					   + " WHERE u.email = :p1 and u.password= :p2 ")
				.setParameter("p1", user.getEmail())
				.setParameter("p2", user.getPassword());
				
			UserModelResultCnx userResult = new UserModelResultCnx();
			
			userResult = (UserModelResultCnx)  query.getSingleResult();
				return userResult;
			
		} catch (Exception e) {
			return null;
		}
		
}
		
	
	
}
