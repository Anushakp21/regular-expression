package assignment1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email : ");
		String email=sc.nextLine();
		sc.close();
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)*");
		Matcher m=p.matcher(email);
		if(m.find() && m.group().equals(email))
		{
			System.out.println("valid email");
		}
		else
		{
			System.out.println("Not valid email");
		}
		
	}

}
