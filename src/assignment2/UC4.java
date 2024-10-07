package assignment2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Phone Number");
		String phNumber=sc.nextLine();
		sc.close();
		Pattern p=Pattern.compile("(91)\\s[7-9][0-9]{9}");
		Matcher m=p.matcher(phNumber);
		if(m.find() && m.group().equals(phNumber))
		{
			System.out.println("Valid Phone Number");
		}
		else
		{
			System.out.println("Not Valid Phone Number");
		}
	}

}
