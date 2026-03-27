package sukkiri.chapter18.practice.main04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Animal>list = new ArrayList();
		
		String filepath = "file/AnimalData.txt";
		try(FileReader fr = new FileReader(filepath);
			BufferedReader br = new BufferedReader(fr);){
			String line;
			
			while((line = br.readLine())!= null) {
				String[] s = line.split(".");
				Animal ani = new Animal(s[0], s[1], Integer.parseInt(s[2]));
				list.add(ani);
				
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		String filearray = "file/AnimalData3.txt";
		try(FileWriter fw = new FileWriter(filearray);
			BufferedWriter bw = new BufferedWriter(fw);){
			
			for(Animal ani : list) {
				bw.write(ani.getName() + "." + ani.getKind() + "." + ani.getAge());
				
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
