package print6_1.question15.main01;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		int n = rand.nextInt(9) + 1;
		char[] array = new char[n];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (char)(rand.nextInt(26) + 65);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = 32;
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
		System.out.println();
	}
	    	
	    }

