package print11_1.question02;

public class Cat extends Animal{
	private int weight;
	
	public Cat(String name, int age, int weight) {
		super(name, age);
		setWeight(weight);
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int Weight) {
		this.weight = weight;
	}
	
	public void showProfile() {
		System.out.printf("名前は%sで、%d歳、体重は%dキログラムです。\n",getName(),getAge(), getWeight());
	}
	
	public void sleep() {
		System.out.println("スースー");
	}
	
	public void speak() {
		System.out.println("にゃーにゃー");
	}

}
