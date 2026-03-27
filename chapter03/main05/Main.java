package sukkiri.chapter03.main05;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		System.out.println("あなたの運勢を占います");
		int fortune = rand.nextInt(5) + 1;
		switch(fortune) {
		case 1,2 -> {
			System.out.println("いいね！");
		}
		case 3 ->{
			System.out.println("普通です");
		}
		case 4,5 ->{
			System.out.println("う～ん・・・");
		}
		}
		System.out.println(fortune);
    }
}
