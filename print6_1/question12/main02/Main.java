package print6_1.question12.main02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("正方形の1辺の長さを入力");
		int size = sc.nextInt();
		System.out.println("長方形の高さを入力");
		int height = sc.nextInt();
		System.out.println("長方形の幅を入力");
		int width = sc.nextInt();
		System.out.println("円の半径を入力");
		double radith = sc.nextDouble();
		
		int squareArea = getArea(size);
		System.out.println("正方形の面積"+ squareArea);
		
		int rectangleArea = getArea(height,width);
		System.out.println("長方形の面積"+ rectangleArea);
		
		double circleArea = getArea(radith);
		System.out.println("円の面積"+ circleArea);
		
		sc.close();	
	}
	public static int getArea(int size) {
		return size * size;
	}
	public static int getArea(int height, int width) {
		return height * width;
	}
	public static double getArea(double radith) {
		return radith * radith * Math.PI;
	}

}
