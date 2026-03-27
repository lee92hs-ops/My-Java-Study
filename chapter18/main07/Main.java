package sukkiri.chapter18.main07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Person>list = new ArrayList<>();
		list.add(new Person("taro", 100));
		list.add(new Person("hanako", 60));
		list.add(new Person("ichiro", 80));
		list.add(new Person("jiro", 50));
		System.out.println("ソート前");
		System.out.println(list);
		
		
		Collections.sort(list);
		
		System.out.println("ソート後");
		System.out.println(list);

	}

}
