package print9_1.question02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			String str = null;
			int length = str.length();
			System.out.println(length);
		}catch(NullPointerException e) {
			System.out.println("null参照があります");
		}
	}

}
