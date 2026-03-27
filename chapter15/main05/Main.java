package sukkiri.chapter15.main05;

import java.util.Scanner;

public class Main {
	
	public static boolean isValidPlayerName(String name) {
		if(name.length() != 8) {
			return false;
		}
		char first = name.charAt(0);
		if(!(first >= 'A' && first <= 'Z')) {
			return false;
		}
		for(int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if(!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(isValidPlayerName(sc.nextLine())) {
			System.out.println("正しい名前です");
		}else {
			System.out.println("入力が不正です");
		}
	}
}
