package print6_1.question03;

public class Main {
	public static void printMsg2(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String message = "Hello";
		int count = 5;
		
		printMsg2(message, count);
		
	}

}