package print4_1.question01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("入力：");
			int input = sc.nextInt();
			if(min > input) {
				min = input;			
			}
			if(max < input) {
				max = input;
			}
			System.out.println("最小値は"+ min);
			System.out.println("最大値は"+ max);
		}
		
			}
	}
