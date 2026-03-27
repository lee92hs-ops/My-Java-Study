package print5_2.question03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] y = {"のび太", "スネ夫", "ジャイアン", "しずかちゃん","出木杉君"};
		for(int i = 0; i < y.length; i++) {
			System.out.println("y[" + i + "]:" + y[i]);
		}
		for(String name : y) {
			System.out.println(name);
		}

	}

}
