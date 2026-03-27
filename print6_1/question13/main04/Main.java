package print6_1.question13.main04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("年齢");
		int age = sc.nextInt();
		System.out.println("身長");
		int height = sc.nextInt();
		checkAge_Height(age, height);
	}	
	public static void checkAge_Height(int age, int height) {
		if(age >= 20) {
			if(height >= 160) {
				System.out.println("20歳以上160cm以上です");
			}else {
				System.out.println("20歳以上160cm未満です");
			}
		}else {
			System.out.println("20歳未満です");
		}
	}

}
