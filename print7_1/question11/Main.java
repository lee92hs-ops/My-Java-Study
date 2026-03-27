package print7_1.question11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar c = Calendar.getInstance();
		
		Date d = c.getTime();
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 (E) HH時mm分ss秒");
		
		System.out.println(f.format(d));
		

	}

}
