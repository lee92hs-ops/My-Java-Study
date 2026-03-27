package print5_1.quetion12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[]ary = new int[20];
		
		Random rand = new Random();
		for(int i = 0; i < ary.length; i++) {
			ary[i] = rand.nextInt(100);
		}
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
			if(i < ary.length - 1) {
				System.out.println("");
			}
		}
		for(int i = 0; i < ary.length-1; i++) {
			for(int j = i + 1; j < ary.length; j++ ) {
				if(ary[i] > ary[j]) {
					int min = ary[i];
					ary[i] = ary[j];
					ary[j] = min;
				}
			}
		}
		System.out.println();
		
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
			if(i < ary.length - 1) {
				System.out.println("");
			}
		}

	}

}
