package print8_1.question02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("入力回数を指定してください");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("入力");
			list.add(sc.nextInt());
			int a = sc.nextInt();
			list.add(a);			
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < list.size(); i++) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		
		System.out.println("最小値:" + min);

	}

}
