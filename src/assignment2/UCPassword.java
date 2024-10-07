package assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UCPassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password : ");
		String password=sc.nextLine();
		sc.close();
		String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9])[A-Za-z\\d[^a-zA-Z0-9]]{8,}$";
		
		if(password.matches(regex)) {
			System.out.println("valid Password");
		}
		else
			System.out.println("Invalid password");
		
	}

}
