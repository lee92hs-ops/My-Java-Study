package print7_1.question04;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ;
		String s = "Let it go.";
		String trimmedS = s.trim();
		System.out.println("1)" + trimmedS + "\"");
		String[] wordsForCount = trimmedS.split("\\s+");
		System.out.println("2)" + wordsForCount.length);
		int countT = 0;
		for(char c : s.toCharArray()) {
			if(c == 't' || c == 'T') {
				countT++;
			}
		}
		System.out.println("3)"+ countT);
		
		String[] wordsArray = s.trim().split("\\s+");
		System.out.println("4)" + wordsArray.length);
		
		StringBuilder sb = new StringBuilder();
		for(String word : wordsArray) {
			sb.append(word);
		}
		System.out.println("5)" + sb.toString());
		
	}

}
