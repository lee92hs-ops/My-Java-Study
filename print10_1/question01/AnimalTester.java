package print10_1.question01;

import java.util.Scanner;

public class AnimalTester {
	
	public static void main(String[] args) {
		
		Animal dog = new Animal("犬", "ポチ", "ワンワン", 3);
		Animal cat = new Animal("猫", "たま", "にゃーにゃー", 5);
		
		dog.show();
		cat.show();
		
		Animal dog2 = new Animal();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("種類を入力してください");
		dog2.setKind(sc.nextLine());
		System.out.print("名前を入力して下さい");
		dog2.setName(sc.nextLine());
		System.out.print("鳴き声を入力してください");
		dog2.setCry(sc.nextLine());
		System.out.print("年齢を入力してください");
		dog2.setAge(Integer.parseInt(sc.nextLine()));
		
		dog2.show();
		
		sc.close();
	}
	

}
