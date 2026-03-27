package print15_1.question01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Account>list = new ArrayList<>();
		list.add(new Account(1,"Charlie", 10000));
		list.add(new Account(2,"Bob", 5000));
		list.add(new Account(3,"John", 7000));
		list.add(new Account(4, "Alice", 3000));
		Collections.sort(list);
		for(Account a : list) {
			System.out.println(a.getName() + "口座残高" + a.getBalance());
		}
		
		Collections.reverse(list);
		for(Account a : list) {
			System.out.println(a.getName() + "口座残高" + a.getBalance());
		}
		
		
		

	}

}
