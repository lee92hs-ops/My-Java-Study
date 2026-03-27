package sukkiri.chapter17.main04;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
		}catch(IOException e) {
			System.out.println("何らかの例外が発生しました");
		}	

	}

}
