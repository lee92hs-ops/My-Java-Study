package print3_1.question05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("mの値を入力：");
		int m = sc.nextInt();
		
		System.out.println("nの値を入力：");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = m; i <= n; i++) {
			sum += i;		
		}
		
		System.out.println(sum);
		
		int max = Math.max(m, n);
		int min = Math.min(m, n);
		for(int i = min; i <= max; i++) {
			
		}
		
		
	}
}