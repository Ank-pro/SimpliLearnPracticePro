package SelfLearning;

public class Operation {
	static int x = ArithmeticCal.num1;
	static int y = ArithmeticCal.num2;
	
	static void add() {
		System.out.println("Ans: "+(x+y));	
	}
	
	static void sub() {
		System.out.println("Ans: "+(x-y));
	}
	
	static void mul() {
		System.out.println("Ans: "+(x*y));
	}
	
	static void div() {
		System.out.println("Ans: "+(x/y));
	}
}
