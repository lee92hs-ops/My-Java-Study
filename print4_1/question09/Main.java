package print4_1.question09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("何回入力：");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("整数値");
			int input =sc.nextInt();
			
			if(sum + input >= 1000) {
				System.out.println("合計が1000を超えました");
				System.out.println("最後の数値は無視します");
				break;
			}else {
				sum += input;
			}
			
			System.out.println("合計"+ sum);
		}
	}

}
