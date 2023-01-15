package FeBeCommonData;

import java.awt.Event;
import java.awt.event.MouseEvent;

import model.User;

public class FeBeData {
	
	 

	@Override
	public String toString() {
		return "FeBeData [Caller=" + Caller + ", CallerName=" + CallerName + ", CallerC=" + CallerC + ", UserLogin="
				+ UserLogin + ", UserPwd=" + UserPwd + ", user=" + user + ", pcName=" + pcName + ", evt="  + "]";
	}

	private   	String Caller	;
	private   	String CallerName;
	private   	Class<?> CallerC;
	private   	String UserLogin;
	private   	String UserPwd	;
	private   	User user		;
	private 	String pcName	;
	private 	Event evt	;
	private 	MouseEvent mouseEvt	;
	
	// Java program to create Thread Safe 
	// Singleton class 
	 
	public static void setInstance(FeBeData instance) {
		FeBeData.instance = instance;
	}

	private static FeBeData instance; 

	private FeBeData() 
	{ 
		// private constructor 
		this.setCaller("A");
		this.setUserLogin("A");
		this.setUserPwd("A");
		this.setPcName("A");
		this.setEvt(new Event(this, 0, this));
	} 

	public void setMouseEvent(MouseEvent mouseEvent) 
	{
		this.mouseEvt = mouseEvent;
		
	}

	//synchronized method to control simultaneous access 
	synchronized public static FeBeData getInstance() 
	{ 
		if (instance == null) 
		{ 
		// if instance is null, initialize 
				instance = new FeBeData(); 
		} 
		return instance; 
	}

	public String getCaller() {
		return Caller;
	}

	public void setCaller(String caller) {
		Caller = caller;
	}

	public String getUserLogin() {
		return UserLogin;
	}

	public void setUserLogin(String userLogin) {
		UserLogin = userLogin;
	}

	public String getUserPwd() {
		return UserPwd;
	}

	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
	}

	public   User getUser() {
		return user;
	}

	public   void setUser(User user) {
		this.user = user;
	}

	public  Class<?> getCallerC() {
		return CallerC;
	}

	public  void setCallerC(Class<?> callerC) {
		CallerC = callerC;
	}

	public  String getCallerName() {
		return CallerName;
	}

	public void setCallerName(String callerName) {
		CallerName = callerName;
	}

	public String getPcName() {
		return pcName;
	}

	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	public Event getEvt() {
		return evt;
	}

	public void setEvt(Event e) {
		this.evt = e;
	}

	public MouseEvent getMouseEvt() {
		return mouseEvt;
	}

	public void setMouseEvt(MouseEvent mouseEvt) {
		this.mouseEvt = mouseEvt;
	} 
	 

}
