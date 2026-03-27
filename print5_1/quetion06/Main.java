package print5_1.quetion06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		String[] s = {"英語", "国語", "数学", "社会", "理科"};
		int[] b = new int[s.length];
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			b[i] = sc.nextInt();
			
			System.out.println("B君：" + s[i] + b[i]);
		}
		sc.close();
		}

	}