package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class EmailVerfication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] emails = {"ank123@gmail.com","pan43@yahoo.com","marcos.055@gmail.com","kristen25@gmal.com","lily.kumar12@gmail.com"};
		System.out.println("Total Emails are: ");
		for(String s:emails) {
			System.out.print(s+"  ");
		}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Enter email to search: ");
		String user = sc.next();
		
		searchEmail(emails,user);
	}
	
	static void searchEmail(String[] emails,String user) {
		int flag = 0;
		for(String s:emails) {
			if(user.equalsIgnoreCase(s)) {
			flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("Found");
		}else {
			System.out.println("Not found.");
		}
	}

}
