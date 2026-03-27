package print4_1.question10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力：");
		int n = sc.nextInt();
		
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j <= n; j++) {
				if(i > j) {
					System.out.println("");
				}else {
					System.out.println("*");
				}
			}
			System.out.println();
		}

	}

}
