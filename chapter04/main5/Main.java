package sukkiri.chapter04.main5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[]scores;
		scores = new int[5];
		scores[1] = 30;
		System.out.println(scores[1]);
		
		scores[0] = 3;
		scores[4] = 2;
		scores[3] = scores[0] + scores[4];
		System.out.println("scores[3}は" + scores[3]);
	}
}