package com.grails.learn

import com.grails.learn.UserService

class HomeController {
	UserService userService
	List<User> users
   def getUsers(){
	    if(session.user){
	     users=  userService.getAllUsers()
			
		 println users.size()
			  if(users){
				  session.allUsers = users
				  redirect(action:"index")
				}
	} // if
		else{
			
			redirect(controller:"user",action:"index")
			//else
		}
   
	}//getUser
   def index() { }
	  // from  ramu...
}
    
   

	
	
    

