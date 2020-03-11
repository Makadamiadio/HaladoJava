package webalkGyakV;

import java.util.Scanner;

public class UserController {
	public static void main(String[] args){
		Scanner eyes = new Scanner(System.in);
		System.out.println("username:");
		String nev = eyes.nextLine();
		User user = new User(nev);
		System.out.println("user '"+user.getUsername()+"' created");
		
		eyes.close();
	}

	
	
}
