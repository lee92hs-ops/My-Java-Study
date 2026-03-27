package print6_1.question14.main03;

import java.util.Random;

public class Main {
	
	public static int[] makeIntArray() {
		Random rand = new Random();
		int n = rand.nextInt();
		int[] array = new int[n];
		
		return array;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = makeIntArray();
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);		
		}
		for(int i : array) {
			System.out.println(i + "");
		}
		System.out.println();
		
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("最大値" + max + "\n");
		
		

	}

}
