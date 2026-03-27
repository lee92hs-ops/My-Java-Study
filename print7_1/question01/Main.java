package print7_1.question01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("strA:");
		String strA = sc.nextLine();
		System.out.println("strB:");
		String strB = sc.nextLine();
		
		if(strA.equals(strB)) {
			System.out.println("strAとstrBは等しいです");
		}else {
			System.out.println("strAとstrBは等しくないです");
		}
		sc.close();
	

}
}