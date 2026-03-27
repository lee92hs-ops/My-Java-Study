package sukkiri.chapter02.main13;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int a = 5;
        int b = 3;
        int m = Math.max(a, b);
        System.out.println("比較実験："+ a + "と" + b + "とで大きいほうは・・・" + m);
        
        int c = 10;
        m = Math.max(a, b);
        m = Math.max(m, c);
        
	}

}
