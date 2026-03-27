package print5_1.quetion07;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] c = {25, 94, 89, 10, 3, 14, 11, 67};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] > max) {
				max = c[i];
				
				if(c[i] < min) {
					min = c[i];
				}
				min = Integer.min(min, c[i]);
				max = Integer.max(max, c[i]);
			}
			System.out.println("最大値："+ max);
			System.out.println("最小値："+ min);
		}
		

	}

}
