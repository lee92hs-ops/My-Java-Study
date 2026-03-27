package print1_1.practice14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("pの値を入力：");
		double p = sc.nextDouble();
		System.out.println("円周率は" + p + "です");
		int q = (int)p;
		System.out.println("円周率は" + q + "です");
		sc.close();
		

	}

}
