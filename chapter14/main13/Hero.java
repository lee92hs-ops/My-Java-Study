package sukkiri.chapter14.main13;

public class Hero {
	String name;
	int hp;
	static int money = 1000;
	
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}

}
