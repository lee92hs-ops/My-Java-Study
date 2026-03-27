package print5_1.quetion10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] a = new int [5][5];
		Random rand = new Random();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[1].length; j++) {
				if(i == 2 && j == 2) {
					a[i][j] = 0;
					continue;					
				}
				a[i][j] = rand.nextInt(50) + 1;
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(50) + 1;
			}
		}
		a[2][2] = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] == 0) {
					System.out.printf("%2s","☆");
				}else {
					System.out.printf("%3d", a[i][j]);
				}
			}
			System.out.println();
		}
	}
}