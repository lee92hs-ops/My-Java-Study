package print3_1.question10;

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
		
		int i = m;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
	}

}
