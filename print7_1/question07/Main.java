package print7_1.question07;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name = "のび太、ドラえもん、スネ夫、ジャイアン、出木杉君、しずかちゃん";
		String[] names = name.split(",");
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("スネ夫"));
			index = i;
		}
		System.out.println(index);
			
			
			
		}
}