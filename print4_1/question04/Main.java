package print4_1.question04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力：");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.println("*");
			}
			System.out.println();
			
		}
		for(int i = n; 0 < i; i--) {
			for(int j = i; 0 < j; j--) {
				System.out.println("*");
			}
			System.out.println();
		}
		
		}
	}