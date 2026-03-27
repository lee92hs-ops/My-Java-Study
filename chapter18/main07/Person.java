package sukkiri.chapter18.main07;

public class Person implements Comparable<Person>{
	
	private String name;
	private int score;
	
	public Person(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void getScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "名前" + name + "点数" + score;
	}
	
	public int compeaTo(Person o) {
		return this.score - o.getScore();
	}

}
