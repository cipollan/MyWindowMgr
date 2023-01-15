package model;

public class User {
	

	public User(String login, String pwd) {
		super();
		Login = login;
		Pwd = pwd;
	}

	private String Login;
	private String Pwd;
	private boolean isValid;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
