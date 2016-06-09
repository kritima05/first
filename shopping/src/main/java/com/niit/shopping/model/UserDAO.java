package com.niit.shopping.model;

public class UserDAO {
	public boolean isValidCredentials(String userID, String password)
	{
		if(userID.equals("kritima")&&password.equals("kritima05"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
