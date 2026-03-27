package sukkiri.chapter18.practice.main02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String filepath = "file/AnimalData.txt";
		String filewrite = "file/Animaldata2.txt";
		
		try(FileReader fr = new FileReader(filepath);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(filewrite);
				BufferedWriter bw = new BufferedWriter(fw);){
			String line;
			
			while((line = br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
