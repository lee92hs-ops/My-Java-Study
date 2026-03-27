package print5_1.quetion11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] MulTable = new int[9][9];
		for(int i = 0; i < MulTable.length; i++) {
			for(int j = 0; j < MulTable[i].length; j++) {
				MulTable[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int i = 1; i <= MulTable.length; i++) {
			for(int j = 1; j <= MulTable[i].length; j++) {
				MulTable[i - 1][j - 1] = i * j;
			} 
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("整数値を入力：");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < MulTable.length; i++) {
			for(int j = 0; j < MulTable[i].length; j++) {
				if(input == MulTable[i][j]) {
					count++;
					System.out.println((i + 1)+"*"+(j + 1));
				}
			}
		}
		if(count > 0) {
			System.out.println(count + "件見つかりました");
		}else {
			System.out.println("入力値が九九の表に存在しません");
		}
		sc.close();
				}
		} 