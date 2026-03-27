package print2_1.question03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("整数値を入力：");
		int a = sc.nextInt();
		System.out.println("整数値を入力：");
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println("aとbの値は等しいです");
		}else {
			System.out.println("aとbの値は等しくないです");
		}
		
		sc.close();

	}

}
