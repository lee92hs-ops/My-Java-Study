package print2_1.question05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("入力：");
		int number = sc.nextInt();
		
		if(number > 0) {
			if(number % 2 == 0) {
				System.out.println("その値は偶数です");
			}else{
				System.out.println("その値は奇数です");
			}
		}else{
			System.out.println("0以下の値が入力されました");
		}
		sc.close();

	}

}
