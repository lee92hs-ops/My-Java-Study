package print2_1.question06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		int a,b,c;
		int max;
		int min;
		System.out.println("整数値aを入力：");
		a = sc.nextInt();
		
		System.out.println("整数値bを入力：");
		b = sc.nextInt();
		
		System.out.println("整数値cを入力：");
		c = sc.nextInt();
		
		max = a;
		min = a;
		 if(b > max) {
			 max = b;
		 }
		 if(b < min) {
			 min = b;
		 }
		 if(c > max) {
			 max = c;
		 }
		 if(c < min) {
			 min = c;
		 }
		 System.out.println("最大値：" + max);
		 System.out.println("最小値：" + min);
		 
		 sc.close();

	}
}
