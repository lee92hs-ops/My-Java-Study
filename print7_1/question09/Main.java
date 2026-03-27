package print7_1.question09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		String s = sc.nextLine();
		
		String postCodePattern = "[0-9]{3}-[0-9]{4}";
		if(s.matches(postCodePattern)) {
			System.out.println("郵便番号です");
		}else {
			System.out.println("郵便番号ではありません");
		}
		
		sc.close();
		

	}

}
