package print6_1.question12.main01;

import java.util.Scanner;

public class Main {
	public static int inputNumber() {
		int inNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力");
		inNumber = sc.nextInt();
		return inNumber;
	}
	public static String numberToMessage(int inNumber) {
		String msg = "";
		switch(inNumber) {
		case 1 ->{
			msg = "Good Morning";
		}
		case 2 ->{
			msg = "Good Afternoon";
		}
		case 3 ->{
			msg = "Good Evening";
		}
		}
		return msg;
	}
	public static void showMessage(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int input = inputNumber();
		String msg = numberToMessage(input);
		showMessage(msg);
		

	}

}
