package print9_1.question03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("整数を入力してください");
		while(true) {
			try {
				String str = sc.nextLine();
				int num = Integer.parseInt(str);
				System.out.println("入力された整数は" + num + "です");
				break;
			}catch(NumberFormatException e) {
				System.out.println("整数値ではありません");
				System.out.println("もう一度入力してください");
			}
		}

	}

}
