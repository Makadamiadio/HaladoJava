package webalkGyakV;

import java.util.Random;

public class User {
	private String username;
	private Random rand = new Random();
	
	public User(String name){
		
		if(isValid(name))
			this.username = name.replaceAll("\\s","");
		else this.username = name.replaceAll("\\s","") + rand.nextInt((int)Math.pow(10, 6-name.length()));
	}

	public String getUsername(){
		return this.username;
	}
	
	public boolean isValid(String name){
		return (name.length() >= 6 );
	}
	
	
}
