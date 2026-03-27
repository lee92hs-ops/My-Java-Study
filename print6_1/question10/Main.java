package print6_1.question10;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static double getAverage(double[] array) {
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		return avg;
	}
	
	public static void printAry(double[] d) {
		for(double val : d) {
			System.out.println("乱数値は"+ val);
		}
	}
	
	public static double [] getAry(int a) {
		double[] array = new double[a];
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextDouble();
		}
		printAry(array);
		return array;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[] d = getAry(n);
		double heikin = getAverage(d);
		System.out.println("平均値は"+ heikin + "です");
		
		sc.close();

	}

}
