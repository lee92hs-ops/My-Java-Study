package print6_1.question13.main02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力");
		int number = sc.nextInt();
		
		if(isEven(number)) {
			System.out.println(number + "は、偶数です");
		}else {
			System.out.println(number + "は、奇数です");
		}
		sc.close();

	}
	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

}
