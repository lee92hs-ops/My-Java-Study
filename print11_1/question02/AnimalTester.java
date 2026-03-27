package print11_1.question02;

import java.util.Scanner;

public class AnimalTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("データ作成数を入力してください");
		int n = Integer.parseInt(sc.nextLine());
		
		Animal[] animal = new Animal[n];
		
		for(int i = 0; i < n; i++) {
			int select = 0;
			do {
				System.out.println("動物を指定してください。１：猫　２：犬");
				select = Integer.parseInt(sc.nextLine());
			}while(!(select == 1 || select == 2));
			
			System.out.print("名前：");
			String name = sc.nextLine();
			
			System.out.print("年齢：");
			int age = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.print("体重：");
				int weight = Integer.parseInt(sc.nextLine());
				animal[i] = new Cat(name,age,weight);
			}else if(select == 2) {
				animal[i] = new Dog(name,age);
			}
		}
		
		for(int i = 0; i < n; i++) {
				animal[i].showProfile();
				animal[i].speak();
				if(animal[i] instanceof Dog) {
					Dog d =(Dog)animal[i];
					d.run();
				}else {
					Cat c = (Cat)animal[i];
					c.sleep();
				}
		}
	}

}
