package print8_1.question03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Integer> fruits = new HashMap();
		if(fruits.isEmpty()) {
			System.out.println("fruitsの中身は空です");
		}else {
			System.out.println("fruitsの中身はあります");
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("入力");
			String str = sc.nextLine();
			String[]item = str.split("");
			
			String itemcount = item[1].replaceAll("[^0-9^]","");
			int count = Integer.parseInt(itemcount);
			fruits.put(item[0], count);
			
			for(String key : fruits.keySet()) {
				System.out.println("果物名:" + key + "個数" + fruits.get(key));
				
				System.out.println("fruitsの要素数:" + fruits.size());
				
				fruits.remove("みかん");
				
			for(String key1 : fruits.keySet()) {
				System.out.println("果物名" + key1 + "個数" + fruits.get(key1));
			}
			}
		}

	}

}
