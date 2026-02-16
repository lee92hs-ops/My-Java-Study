package print8.question06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("乱数を作成する数を指定してください:");
		int n = sc.nextInt();
		ArrayList<Integer> list = getListData(n);

		showListData(list);
	}
	public static ArrayList<Integer> getListData(int n){

		ArrayList<Integer> list = new ArrayList<Integer>();

		Random rand = new Random();
		for(int i=0;i<n;i++) {
			list.add(rand.nextInt(100));
		}
		
		
		return list;
	}

	public static void showListData(ArrayList<Integer> list) {
		for(int a : list) {
			System.out.println(a);
		}
	}

}
