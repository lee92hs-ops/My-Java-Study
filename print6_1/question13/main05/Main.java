package print6_1.question13.main05;

import java.util.Scanner;

public class Main {
	public static String getScoreMsg(int math, int en) {
		if(math >= 60) {
			if(en >= 60) {
				return "よく頑張りました";
			}else {
				return "英語の追試をします";
			}
		}else {
			if(en >= 60) {
				return "数学の追試をします";
			}else {
				return "数学と英語の追試をします";
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("数学の点数");
		int math = sc.nextInt();
		System.out.println("英語の点数");
		int en = sc.nextInt();
		System.out.println(getScoreMsg(math,en));
		sc.close();
		
	}

}
