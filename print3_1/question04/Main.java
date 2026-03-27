package print3_1.question04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("nの値を入力：");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 2; i <= n; i += 2) {
			sum += i;
		}
		System.out.println("1～"+n+"までのうち2+4+6="+sum+"です");
		sc.close();

	}

}
