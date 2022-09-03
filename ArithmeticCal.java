package SelfLearning;

import java.util.Scanner;

public class ArithmeticCal {
	static Scanner sc = new Scanner(System.in);
	static int num1;
	static int num2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------"+"My Calculator"+"----------------------------");
		
		
		while(true) {
			System.out.println("Enter num1: ");
			num1 = sc.nextInt();
			System.out.println("Enter num2: ");
			num2 = sc.nextInt();
		System.out.println("Enter operation: ");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Exit");
		int opt = sc.nextInt();
		
		if(opt == 5) {
			break;
		}
		switch(opt) {
		case 1:
			Operation.add();
			break;
		case 2:
			Operation.sub();
			break;
		case 3:
			Operation.mul();
			break;
		case 4:
			Operation.div();
			break;
			default:
				System.out.println("Invalid option");
		}
		}
	}
	
	

}
