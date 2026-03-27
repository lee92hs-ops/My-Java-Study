package sukkiri.chapter03.practice.main06;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("【数あてゲーム】");
		int ans = rand.nextInt(10);
		for(int i = 0; i < 5; i++) {
			System.out.println("0～9の数字を入力してください");
			int num = sc.nextInt();
			if(ans == num) {
				System.out.println("アタリ！");
				break;				
			}else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");

	}

}