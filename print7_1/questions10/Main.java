package print7_1.questions10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {

        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String formattedDate = sdf.format(now);
        System.out.println(formattedDate);
    }

}
