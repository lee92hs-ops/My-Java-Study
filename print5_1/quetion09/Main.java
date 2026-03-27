package print5_1.quetion09;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] omikuji = {"凶", "吉", "中吉", "大吉"};
		Random rand = new Random();
		
		System.out.println(omikuji[rand.nextInt(omikuji.length)]);
	}

}
