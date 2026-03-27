package print4_1.question07;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String str = "";
		
		do {
			int r = rand.nextInt(4);
			switch(r) {
			case 0:
			System.out.println("あなたの運勢は凶です");break;
			case 1:
			System.out.println("あなたの運勢は吉です");break;
			case 2:
			System.out.println("あなたの運勢は中吉です");break;
			case 3:
			System.out.println("あなたの運勢は大吉です");break;
			}
			
			
			
		}while(str.equals('y'));
		System.out.println("おみくじを終了します");
		
	}
		
		

}
