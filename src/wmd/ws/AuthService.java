package wmd.ws;

import java.io.Serializable;
import java.util.HashMap;

import wmd.ws.entities.User;

public class AuthService implements Serializable{
	
	static HashMap<String, User> hmap;
	static{
		hmap = new HashMap<String,User>();
		hmap.put( "achiban",new User("achiban","azerty123"));
		hmap.put("bouchra",new User("bouchra","azerty"));
		hmap.put("user3",new User("anonyme","aqw123"));
	}
	public static User CheckUser (String login,String pswd){
//		User user=new User(login, pswd);
		if(hmap.containsKey(login)){
			return hmap.get(login);
		}else{
		return null;}
	}	
	
	
	
	
	
	

}
