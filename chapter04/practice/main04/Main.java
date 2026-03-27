package sukkiri.chapter04.practice.main04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		
		int input = sc.nextInt();
		
		for(int n : numbers) {
			if(n == input) {
				System.out.println("アタリ!");
			}
		}

	}

}
