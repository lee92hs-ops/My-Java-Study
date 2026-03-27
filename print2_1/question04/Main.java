package print2_1.question04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字列Aを入力：");
		String strA = sc.nextLine();
		
		System.out.println("文字列Bを入力：");
		String strB = sc.nextLine();
		
		if(strA.equals(strB)) {
			System.out.println("二つの文字は等しいです");
		}else {
			System.out.println("二つの文字は等しくないです");
		}
		sc.close();

	}

}
