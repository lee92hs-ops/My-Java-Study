package print7_1.question06;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] country = {"Japan", "Australia", "United States", "China", "Brazil"};
		int[] population = {126500000, 25500000, 331000000, 1448500000,  215400000};
		final String FORMAT = "%-8s : %8d\n";
		for(int i = 0; i < country.length; i++) {
			System.out.printf(FORMAT, country[i], population[i]);
		}
		

	}

}
