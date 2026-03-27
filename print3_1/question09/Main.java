package print3_1.question09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("nの値を入力：");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			if(i % 2 == 0) {
				sum += i;
				
			}
			i++;
		}
		System.out.println(sum);

	}

}
