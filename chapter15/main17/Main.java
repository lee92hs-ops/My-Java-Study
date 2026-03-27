package sukkiri.chapter15.main17;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate d1 = LocalDate.of(2023, 1, 1);
		LocalDate d2 = LocalDate.of(2023, 1, 4);
		
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1,  d2);
		
		LocalDate d3 = d2.plus(p2);

	}

}
