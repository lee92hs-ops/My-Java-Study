package sukkiri.chapter02.main16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの名前を入力してください。");
		String name = sc.nextLine();
		System.out.println("あなたの年齢を入力してください。");
		int age = sc.nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
		
		System.out.println(sc.next());
		sc.close();

	}

}
