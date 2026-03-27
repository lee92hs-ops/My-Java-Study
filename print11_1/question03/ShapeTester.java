package print11_1.question03;

import java.util.Scanner;

public class ShapeTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("「横、縦」の形で半角スペースで数字を区切って1行で入力してください");
		String[] str = sc.nextLine().split("");
		Rectangle rc = new Rectangle(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
		
		System.out.println("正方形のインスタンスを作成します");
		System.out.println("一辺の長さを入力してください");
		int sippen = Integer.parseInt(sc.nextLine());
		Square sq = new Square(sippen);
		
		System.out.println("長方体のインスタンスを作成します");
		System.out.println("「横、縦、長さ」の形で半角スペースで数字を区切って1行で入力してください");
		String [] str2 = sc.nextLine().split("");
		Rectangular rr = new Rectangular(Integer.parseInt(str2[0]),Integer.parseInt(str2[1]), Integer.parseInt(str2[2]));
		
		System.out.println("立方体のインスタンスを作成します");
		System.out.println("一辺の長さを入力してください");
		int cippen = Integer.parseInt(sc.nextLine());
		Cube cb = new Cube(cippen);
		
		System.out.println("長方形の面積" + rc.getAreaOfFigure());
		System.out.println("正方形の面積" + sq.getAreaOfFigure());
		System.out.println("直方体の表面積" + rr.getAreaOfFigure());
		System.out.println("直方体の体積" + rr.getVolume());
		System.out.println("立方体の表面積" + cb.getAreaOfFigure());
		System.out.println("立方体の体積" + cb.getVolume());
	}

}
