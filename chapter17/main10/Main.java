package chapter17.main10;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
        // 수정된 부분: "data.txt" 뒤에서 따옴표를 닫았습니다.
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write("hello!");
		} catch(Exception e) {
			System.out.println("何らかの例外が発生した");
		}
	}
}