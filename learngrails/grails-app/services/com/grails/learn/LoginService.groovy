package com.grails.learn

import com.grails.learn.User

class LoginService {
	
	
	def userLogin(userName,password){
		User.findByUserNameAndPassword(userName,password)
	
	}

}
