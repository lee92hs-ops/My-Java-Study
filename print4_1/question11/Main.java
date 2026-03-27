package print4_1.question11;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// TODO 自動生成されたメソッド・スタブ
		
		while(bool) {
			int myhand;
			do {
				System.out.println("あなたの手を入力してください。（グー：０、チョキ：１、パー：２）");
				myhand = Integer.parseInt(sc.nextLine());
				String s = sc.nextLine();
				myhand = Integer.parseInt(s);
			}while(myhand < 0 || 2 < myhand);
			
			int npchand = rand.nextInt(3);
			
			switch(myhand) {
			case 0:
				System.out.println("NPCの手はグーです");break;
			case 1:
				System.out.println("NPCの手はチョキです");break;
			case 2:
				System.out.println("NPCの手はパーです");break;
			}
			
			if((myhand == 0 && npchand == 2)|| (myhand == 1 && npchand == 2) || (myhand == 2 && npchand == 0)){
				System.out.println("あなたの勝ちです");		
			}else if((myhand == 0 && npchand == 2) || (myhand == 1 && npchand == 0) || (myhand == 2 && npchand == 1)) {
				System.out.println("あなたの負けです");
			}else {
				System.out.println("あいこです");
			}
			
			String str = "";
			do {
				System.out.println("再度対戦しますか？(y/n):");
				str =sc.nextLine();
			}while(!str.equals("y") && !str.equals("n"));
			
			if(str.equals("n")) {
				bool = false;
			}
		}
		System.out.println("プログラムを終了します");
			
		}

	}
