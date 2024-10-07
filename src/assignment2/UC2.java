package assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name : ");
		String lastName =sc.nextLine();
		sc.close();
		Pattern p=Pattern.compile("[A-Z][a-zA-z]{2}");
		Matcher m=p.matcher(lastName);
		if(m.find() && m.group().equals(lastName))
		{
			System.out.println("Valid last Name");
		}
		else
		{
			System.out.println("Not Valid last Name");
		}

	}

}
