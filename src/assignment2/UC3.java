package assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email");
		String emial=sc.nextLine();
		sc.close();
		Pattern p=Pattern.compile("[A-Za-z][a-zA-z][a-zA-Z0-9._]*@[A-Za-z][A-Za-z0-9]+([.][a-zA-z]+)*");
		Matcher m=p.matcher(emial);
		if(m.find() && m.group().equals(emial))
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Not Valid Email");
		}
		
	}
	

}
