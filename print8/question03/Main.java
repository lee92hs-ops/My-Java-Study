package print8.question03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Map<String,Integer> fruits = new HashMap<>();
		
		if(fruits.isEmpty()){
			System.out.println("fruitsの中身は空です");
		}else {
			System.out.println("fruitsの中身はあります");
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print("入力");
			String str = sc.nextLine();//「りんご 3個」
			String[] item = str.split(" ");
			String itemcount = item[1].replaceAll("[^0-9]", "");
			int count = Integer.parseInt(itemcount);
			fruits.put(item[0], count);
		}
				
		for(String key : fruits.keySet()) {
			System.out.println("果物名：" + key + " 個数" + fruits.get(key));
		}
		
		System.out.println("fruitsの要素数：" + fruits.size());
		
		fruits.remove("みかん");
		
		for(String key : fruits.keySet()) {
			System.out.println("果物名：" + key + " 個数" + fruits.get(key));
		}

	}

}
