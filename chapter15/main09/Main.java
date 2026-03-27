package sukkiri.chapter15.main09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT,"minato", "Hero", 20000);
		String s2 = String.format(FORMAT, "asaka", "sensi", 420000);
		String s3 = String.format(FORMAT, "sugawara", "mahoutukai", 1120000);
		String s4 = String.format(FORMAT, "takesi", "asobininn", 200);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.printf("製品番号%s-% 2d", "SJV", 3);
		}
	}