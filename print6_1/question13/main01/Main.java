package print6_1.question13.main01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力");
		
		int input = sc.nextInt();
		
		checkNumber(input);
		
		sc.close();

	}
	public static void checkNumber(int num) {
		if(num == 0) {
			System.out.println("0です");
		}else {
			System.out.println("0ではありません");
		}
	}

}
