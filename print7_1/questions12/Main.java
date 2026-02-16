package print7_1.questions12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日（E） HH時mm分ss秒");

        String formatted = now.format(formatter);

        System.out.println(formatted);
    }

}
