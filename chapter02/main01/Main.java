package sukkiri.chapter02.main01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int a;
        int b;
        a = 20;
        b = a + 5;
        System.out.println(a);
        System.out.println(b);
        
        int c = a++ + --b + ++a;
        System.out.println("a=" + a + "b=" + b + "c=" +c);
        
	}

}
