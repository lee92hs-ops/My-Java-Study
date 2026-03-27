package print6_1.question09;

import java.util.Scanner;

public class Main {
	public static int getMinValue(int[] array) {
		int minValue = Integer.MAX_VALUE;
		
		for(int value : array) {
			if(value < minValue) {
				minValue = value;
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("5つの整数を入力してください");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i + 1);
			numbers[i] = sc.nextInt();
			
			int minResult = getMinValue(numbers);
			
			System.out.println("最小値は[" + minResult + "]です");
			
			sc.close();
		}

	}

}
