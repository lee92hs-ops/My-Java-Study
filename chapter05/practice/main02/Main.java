package sukkiri.chapter05.practice.main02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title = "お誘い";
		String address = "dummy@example.com";
		String text ="今度、飲みに行きませんか";
		email(title, address, text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名："+ title);
		System.out.println("本文:" + text);
	}

}
