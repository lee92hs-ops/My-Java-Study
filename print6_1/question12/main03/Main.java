package print6_1.question12.main03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("ループ回数を指定");
		int times =sc.nextInt();
		
		for(int i = 1; i < times; i++) {
			System.out.println("\n【"+ i + "回目の処理】");
			execution();
		}
	}
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[4];
		for(int i = 0; i < numbers.length; i++) {
			System.out.println((i + 1) + "つめの要素を入力" );
			numbers[i] = sc.nextInt();
		}
		
		showArray(numbers);
		reverse(numbers);
		showArray(numbers);
	}
	
	public static void showArray(int [] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("["+ i + "]:" +  array[i] + "");
		}
		System.out.println();
	}
	public static void reverse(int[] array) {
		for(int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println("反転しました");
	}

}
