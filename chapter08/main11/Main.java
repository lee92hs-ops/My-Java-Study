package sukkiri.chapter08.main11;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}

}
