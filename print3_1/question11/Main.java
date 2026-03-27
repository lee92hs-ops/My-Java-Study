package print3_1.question11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		double sum = 0.0;
		int count = 5;
		
		for(int i = 0; i < count; i++) {
			System.out.println("入力：");
			
			double number = sc.nextDouble();
			sum += number;		
		}
		double ave = sum / count;
		System.out.println("平均："+ ave);
		
		sc.close();

	}

}
