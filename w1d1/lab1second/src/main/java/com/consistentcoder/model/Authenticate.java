package com.consistentcoder.model;

public class Authenticate {
	
	public String checkAuthenticate(String username, String password) {
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("test123")) {
            return "success";
        } else {
            return "failure";
        }
    }
}
