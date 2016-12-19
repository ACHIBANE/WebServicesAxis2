package wmd.ws.entities;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

public class User implements Serializable{

	private static final AtomicLong count=new AtomicLong(0);
	private String login;
	private Long id;
	private String password;
	public User(String login, String password){
		id=count.incrementAndGet();
		this.login=login;
		this.password=password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
