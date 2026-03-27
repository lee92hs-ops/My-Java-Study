package print2_1.question10;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("自分の手を入力。グー：０　チョキ：１　パー：２");
		int myhand = sc.nextInt();
		
		if(myhand >= 0  && myhand <= 2) {
			int npchand = rand.nextInt(3);
			
			if(myhand == 0) {
				System.out.println("あなたの手はグーです");
			}else if(myhand == 1) {
				System.out.println("あなたの手はチョキです");
			}else {
				System.out.println("あなたの手はパーです");
			}
			if(npchand == 0) {
				System.out.println("NPCの手はグーです");
			}else if(npchand == 1) {
				System.out.println("NPCの手はチョキです");
			}else {
				System.out.println("NPCの手はパーです");
			}
			if((myhand == 0 && npchand == 1) || (myhand == 1 && npchand == 2) || (myhand == 2 && npchand == 0)) {
				System.out.println("あなたの勝ちです");
			}else if((myhand == 0 && npchand == 2) || (myhand == 1 && npchand == 0) || (myhand == 2 && npchand == 1)) {
				System.out.println("あなたの負けです");
			}else {
				System.out.println("あいこです");
			}
		}

	}

}
