package print6_1.question07;

import java.util.Scanner;

public class Main {
	public static double getMinValue(double a, double b ) {
		return (a < b)? a : b;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("double a");
		double value1 = sc.nextDouble();
		System.out.println("double b");
		double value2 = sc.nextDouble();
		double minValue = getMinValue(value1, value2);
		
		System.out.println("double a" + value1 + "double b" + value2);
		
		sc.close();

	}

}
