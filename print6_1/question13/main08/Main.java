package print6_1.question13.main08;

public class Main {
	
	public static void doubleArrayElements(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] *= 2;
		}
	}
	
	public static void showArrayElements(int[] array) {
		for(int a : array) {
			System.out.println(a + "");
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {10, 20, 30, 40, 50};
		System.out.println("before");
		showArrayElements(array);
		System.out.println();
		doubleArrayElements(array);
		System.out.println("after");
		showArrayElements(array);

	}

}
