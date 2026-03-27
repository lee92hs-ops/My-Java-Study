package print4_1.question06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		String str = "";
		do {
			System.out.println("入力して下さい");
			str = sc.nextLine();
		}while(!str.equals("y") && !str.equals("n"));
		
		System.out.println("プログラムを終了します");
	}

}
