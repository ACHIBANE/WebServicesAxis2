package wmd.ws.entities;

public class User {
	
	Long userID;
	String login;
	String pswd;
	
	
	public User(String login, String pswd) {
		
		this.login = login;
		this.pswd = pswd;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	
	

}
