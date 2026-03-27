package print15_1.question03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Person>list = new ArrayList<>();
		list.add(new Person("Charlie", 20, 170, 70));
		list.add(new Person("Bob", 15, 165, 55));
		list.add(new Person("John", 18, 175,70));
		list.add(new Person("Alice", 23, 155, 45));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[0: 名前　１：年齢　２：身長　３：体重]で昇順ソートします");
		int select = sc.nextInt();
		PersonComparator pc = new PersonComparator(select);
		Collections.sort(list, pc);
		
		for(Person p : list) {
			System.out.printf(p.getName() + "年齢：" + p.getAge() + "身長：", p.getHeight() + "体重" + p.getWeight());
		}

	}

}
