package sukkiri.chapter18.main06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Student>list = new ArrayList<>();
		list.add(new Student("taro", 100));
		list.add(new Student("hanako", 60));
		list.add(new Student("ichiro", 80));
		list.add(new Student("jiro", 50));
		System.out.println("ソート前");
		System.out.println(list);
		
		Collections.sort(list, new StudentComparator());
		
		System.out.println("ソート後");
		System.out.println(list);

	}

}
