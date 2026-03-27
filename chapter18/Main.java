package sukkiri.chapter18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String filepath = "data.txt";
		try(FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);){
			String line;
			
		while((line = br.readLine()) != null) {
			
			System.out.println(line);
			
		}
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
