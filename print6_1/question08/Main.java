package print6_1.question08;

import java.util.Scanner;

public class Main {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a + b =" + add(a,b));
		System.out.println("a - b =" + sub(a,b));
		System.out.println("a * b =" + mul(a,b));
		System.out.println("a / b =" + div(a,b));
	}

}
