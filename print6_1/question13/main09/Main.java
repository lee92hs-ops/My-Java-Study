package print6_1.question13.main09;

public class Main {
	
	public static void printSubject_Score(String[] s, int[] a) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i] +  ":" + a[i] + "");
		}
		System.out.println();
	}
	
	public static int countRetest(int[] a) {
		int count = 0;
		for(int i : a) {
			if(i < 60) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] s = {"英語", "国語", "数学", "社会", "理科"};
		int[] a = {48, 60, 50, 42, 80};
		printSubject_Score(s, a);
		int count = countRetest(a);
		System.out.println(count + "科目追試が必要です");
		
	}
}
