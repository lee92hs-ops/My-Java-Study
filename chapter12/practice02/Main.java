package sukkiri.chapter12.practice02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		X obj = new A();
		obj.a();
		
		
		
		Y y1 = new A();
		Y y2 = new B();
		
		y1.a();
		y2.b();
		
		Y[] yy = new Y[2];
		yy[0] = new A();
		yy[1] = new B();
		
		for(Y ans : yy) {
			ans.b();
		}

	}

}
