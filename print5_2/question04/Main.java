package print5_2.question04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double[] temp = {33.2, 33.6, 34.9, 38.4, 34, 30.7, 27.5};
		double sum = 0;
		double avg = 0;
		
		for(int i = 0; i < temp.length; i++) {
			sum += temp[i];		
		}
		avg = sum / temp.length;
		System.out.println("平均気温は"+ avg + "です" );
		System.out.printf("平均気温は%.1f度です\n", avg);

	}

}
