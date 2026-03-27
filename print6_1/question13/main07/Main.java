package print6_1.question13.main07;

import java.util.Scanner;

public class Main {
	
	public static int add(int m, int n) {
		int sum = 0;
		if(m > n) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		for(int i = m; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("mの値を入力");
		int m = sc.nextInt();
		System.out.println("nの値を入力");
		int n = sc.nextInt();
		System.out.println(add(m,n));
		sc.close();

	}

}
