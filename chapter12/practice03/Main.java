package sukkiri.chapter12.practice03;

import sukkiri.chapter12.practice02.A;
import sukkiri.chapter12.practice02.B;
import sukkiri.chapter12.practice02.Y;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		for(Y y : array) {
			y.b();
		}

	}

}
