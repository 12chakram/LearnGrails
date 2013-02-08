package com.grails.learn

class User {

	String userName
	String password
	
	static mapping ={
		
		table "New_USer"
		
		userName column:"USER_NAME"
		password column:"PASSWORD"
		
	                                version false
	}
	
    static constraints = {
		userName(blank:false, nullable:false)
    }
}
