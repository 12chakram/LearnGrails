package com.grails.learn

import com.grails.learn.LoginService


class UserController {
	
	LoginService loginService

	
	def login(){
		
		def userName = request.getParameter("userName")
		def password = request.getParameter("password")

		
	def user =	loginService.userLogin(userName, password)
	
	if(user){
		
		session.user = userName
		session.LoggedIn="yes"
		
	 	redirect(controller:"home",action:"index")
		
		//redirect(action:"userspage")
		
	}else{
	
	flash.message = "Invalid credentials"
	redirect(action:"index")
	
}

	}// login
	
	
	def logout(){
		session.invalidate();
		redirect(action:"index")
	}
	
	
	
    def index() {
	}
	
	
	
}


