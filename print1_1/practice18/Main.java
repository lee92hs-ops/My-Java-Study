package print1_1.practice18;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("整数n");
		int n = sc.nextInt();
		
		int r = rand.nextInt(n + 1);
		System.out.println("乱数値：" + r);
		
	}

}
