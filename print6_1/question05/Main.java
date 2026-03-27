package print6_1.question05;

import java.util.Scanner;

public class Main {
	public static void printMin(double a, double b, double c) {
		double min =Math.min(Math.min(a, b), c);
		System.out.println("a,b,c"+ min);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("double a:");
		double num1 = sc.nextDouble();
		System.out.println("double b:");
		double num2 = sc.nextDouble();
		System.out.println("double c:");
		double num3 = sc.nextDouble();
		
		sc.close();
		
		System.out.println("\ndouble a, b, c:"+ num1 + num2 + num3);
		printMin(num1, num2, num3);

	}

}
