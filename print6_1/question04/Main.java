package print6_1.question04;

import java.util.Scanner;

public class Main {
	public static void printRA(double height, double width) {
		double area = height * width;
		System.out.println("height * width:" + area);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		double takasa, yoko;
		
		System.out.println("takasa(double):");
		takasa = sc.nextDouble();
		System.out.println("yoko(double):");
		yoko = sc.nextDouble();
		
		sc.close();
		
		printRA(takasa, yoko);
		
		

	}

}
