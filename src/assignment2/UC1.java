package assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Name : ");
		String fisrtName =sc.nextLine();
		sc.close();
		Pattern p=Pattern.compile("[A-Z][a-zA-z]{2}");
		Matcher m=p.matcher(fisrtName);
		if(m.find() && m.group().equals(fisrtName))
		{
			System.out.println("Valid First Name");
		}
		else
		{
			System.out.println("Not Valid First Name");
		}
	}

}
