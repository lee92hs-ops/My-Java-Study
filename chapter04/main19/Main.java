package sukkiri.chapter04.main19;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] scores = {{40, 50, 60},{80, 60, 70}};
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		for(int i = 0; i < scores.length; i++) {
			for(int j =  0; j < scores[0]. length -1; i++) {
				System.out.println(scores[i][j]);
			}
		}
	}
}
