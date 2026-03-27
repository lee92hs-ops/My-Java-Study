package sukkiri.chapter04.main12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] seq = new int[10];
		Random rand = new Random();
		
		for(int i = 0; i < seq.length; i++) {
			seq[i] = rand.nextInt(4);
		}
		
		for(int i = 0; i < seq.length; i++) {
			switch(seq[i]) {
			case 0 ->{
				System.out.println("A");
			}
			case 1 -> {
				System.out.println("T");
			}
			case 2 -> {
				System.out.println("G");
			}
			case 3 -> {
				System.out.println("C");
			}
			}
		}
	}

}
