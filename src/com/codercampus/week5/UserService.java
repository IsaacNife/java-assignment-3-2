package com.codercampus.week5;



public class UserService {
	
	public static User createUser(String [] array) {
		User user = new User();
		user.setUsername(array[0]);
		user.setPassword(array[1]);
		user.setName(array[2]);
        return user;		
	}

	boolean found = false;

	public User getValidUser(String username, String password, User[] users) {
		for (User user : users) {
			if ( username.equalsIgnoreCase(user.getUsername()) && password.equals(user.getPassword())) {
				      System.out.println("Welcome:" + user.getName());
				      found = true;
				      return user;
			}

		}
		return null;
	}

}
