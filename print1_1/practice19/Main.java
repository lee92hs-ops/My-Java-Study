package print1_1.practice19;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		
		int a = rand.nextInt(11) - 5;
		int b = rand.nextInt(-5,6);
		System.out.println("乱数値：" + a);
		System.out.println(b);
		
	}

}
