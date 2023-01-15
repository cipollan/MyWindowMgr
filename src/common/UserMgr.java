package common;

import model.User;

public class UserMgr {
	
	public UserMgr(String userName, User user) {
		super();
		this.userName = userName;
		this.user = user;
	}

	private String userName;

	public UserMgr(User user) {
		super();
		this.user = user;
	}
	
	private User user;
	
	private   UserMgr() {
		// TODO Auto-generated constructor stub
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public User verifyUser( ) {
		
		this.user.setValid(true);
		
		
		return this.user;
	}
	
	
	

}
