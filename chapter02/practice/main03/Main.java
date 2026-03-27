package sukkiri.chapter02.practice.main03;


import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("ようこそ占いの館へ");
		System.out.print("あなたの名前を入力してください＞");
		String name =sc.nextLine();
		System.out.print("あなたの年齢を入力してください＞");
		int age = sc.nextInt();
		int fortune = rand.nextInt(4) + 1;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は"+ fortune + "です");
		System.out.println("(1:大吉　2:中吉　3:吉 4:凶)");
		

	}

}
