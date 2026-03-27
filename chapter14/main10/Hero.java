package sukkiri.chapter14.main10;

public class Hero {
	String name;
	int hp;
	static int money = 1000;
	
	public String toString() {
		return "名前：" + this.name + "/HP:" + this.hp;
	}
	
	public boolean equals(Object o) {
		if(this == o) {return true;}
		if(o instanceof Hero h) {
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}

}
