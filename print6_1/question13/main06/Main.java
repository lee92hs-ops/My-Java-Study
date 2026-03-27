package print6_1.question13.main06;

import java.util.Scanner;

public class Main {
	
	public static String fortune(int number) {
		switch(number) {
		case 1:
		case 7:
			return "今日の運勢は中吉です";
		
		case 2:
			return "今日の運勢は大吉です";
		
		case 3:
		case 6: 
		case 8:
			return "今日の運勢は吉です";
			
		case 4:
			return "今日の運勢は小吉です";
			
		case 5:
			return "今日の運勢は凶です";
		
		default:
			return "範囲外の数字です";
		}		
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("1～8の数字を入力してください");
		
		if(sc.hasNextInt()) {
			int inputNumber = sc.nextInt();
			String result = fortune(inputNumber);
			System.out.println(inputNumber);
			System.out.println(result);
		}else {
			System.out.println("無効な入力です、整数を入力してください");
		}
		
		sc.close();

	}

}
