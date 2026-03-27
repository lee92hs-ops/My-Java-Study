package sukkiri.chapter04.main14;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int[] scores = {20, 30, 40, 50, 80};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println();
		
		for(int value : scores) {
			System.out.println(value);
		}
	}
}