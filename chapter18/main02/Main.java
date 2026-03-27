package sukkiri.chapter18.main02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String filepath = "data.txt";
		
		try(FileWriter fw = new FileWriter(filepath);
		BufferedWriter bw = new BufferedWriter(fw);){
		
		for(int i = 0; i < 5; i++) {
			bw.write("[" + i + "]");
			bw.newLine();
		}
		}catch(IOException e) {
			
		e.printStackTrace();
		}
		

	}

}
