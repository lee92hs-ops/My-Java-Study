package print9_1.question06;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("IDを入力してください");
				String str = sc.nextLine();
				int id = Integer.parseInt(str);
				System.out.println("名前を入力してください");
				String name = sc.nextLine();
				User user = new User(id, name);
				System.out.println(user.toString());
				break;
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println();
			}
			
		}

	}

}
