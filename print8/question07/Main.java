package print8.question07;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		System.out.println("乱数を発生させる数を指定してください");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("探したい数字を指定してください");

		int key = sc.nextInt();

		Set<Integer> set = getSet(n);

		int index = getNum(set,key);

		printIndex(index);

		showSet(set);
	}
	

	public static LinkedHashSet<Integer> getSet(int n){

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		Random rand = new Random();
		while(set.size() != n) {
			set.add(rand.nextInt(n * 2));
		}

		return set;
	}

	public static int getNum(Set<Integer> set , int key) {
		//1
		int index = 0;
		for(int i : set) {
			if(i == key) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static void printIndex(int index) {
		//1
		if(index < 0) {
			System.out.println("その値は要素に存在しません");
		}else {//2
			System.out.println("その値は" + index + "番目にあります");
		}
		
	}

	public static void showSet(Set<Integer> set) {
		//1
		for(int i : set) {
			System.out.println(i);
		}
		
	}

}
