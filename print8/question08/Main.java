package print8.question08;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String str = "むかし　むかし　あるところ　に　おじいさん　と　"
				+ "おばあさん　が　いました　おじいさん　は　やま　へ　しばかり　に　"
				+ "おばあさん　は　かわ　へ　せんたく　に　いきました　おばあさん　が　"
				+ "かわ　で　せんたく　を　している　と　おおきな　もも　が　ながれてきました　";
		String[] words = str.split("　");
		Map<String,Integer> wordCountMap = new HashMap<String,Integer>();
		int count = 0;
		for(String word : words) {
			if(word.length() == 1) {
				continue;
			}

			if(wordCountMap.containsKey(word)) {

				int value = wordCountMap.get(word);
				value++;
				wordCountMap.put(word, value);
				if(count < value) {
					count = value;
				}
			}else {
				wordCountMap.put(word, 1);
			}
			
		}

		
		for(int i=count;i>0;i--) {
			for(String key : wordCountMap.keySet()) {
				if(wordCountMap.get(key) == i) {
					System.out.println(key + ":" + wordCountMap.get(key) + "回");
				}
			}
		}

	}
}
