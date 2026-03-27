package print6_1.question14.main04;

import java.util.Random;

public class Main {
	public static int[] makeIntArray() {
		Random rand = new Random();
		int size = rand.nextInt(9) + 1;
		return new int[size];
	}
	
	public static void fillWithRandomValues(int[] array) {
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		System.out.println("すべての要素");
		for(int value : array) {
			System.out.println(value + "");
		}
		System.out.println("");
	}
	
	public static void printLargestElement(int[] array) {
		if(array == null || array.length == 0) {
			System.out.println("配列が空もしくはnullです");
			return;
		}
		int maxVal = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > maxVal) {
				maxVal = array[i];
			}
		}
		System.out.println("最大値"+maxVal);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = makeIntArray();
		System.out.println("配列の要素"+ array.length);
		fillWithRandomValues(array);
		printLargestElement(array);
	}

}
