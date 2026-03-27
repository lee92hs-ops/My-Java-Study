package print7_1.question05;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("A君:");
		String[] s = {"英語", "国語", "数学", "社会", "理科"};
		int[] a = {75, 80, 60, 90, 55};
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length; i++) {
			sb.append(s[i]).append(":").append(a[i]).append("点");
			
			if(i < s.length - 1) {
				sb.append("、");
			}
		}
		System.out.println(sb.toString());

	}

}
