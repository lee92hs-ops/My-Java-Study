package print4_1.question02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		while(true) {
			System.out.println("入力：");
			int input = sc.nextInt();
			
			if(input == 0) {
				break;
			}
			if(input < 0) {
				continue;
			}
			sum += input;
			
			if(input == 0) {
				break;
			}else if(input < 0) {
				continue;
			}else {
				sum += input;
			}
			System.out.println("合計は"+ sum);
		}
	}
}