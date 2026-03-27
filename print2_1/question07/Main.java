package print2_1.question07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("受験者番号を入力：");
		int num = sc.nextInt();
		if(num == 1105 || num ==1200 || num ==1305) {
			System.out.println(num + "番は合格です");
		}else {
			System.out.println(num + "番は不合格です");
		}
		
		sc.close();
	}

}
