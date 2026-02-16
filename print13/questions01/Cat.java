package print13.questions01;

public class Cat extends Animal{
	
	private int weight;
	
	public Cat(String name, String gender, int age, int weight) {
		super(name, gender, age);
		setWeight(weight);
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	void cry() {
		System.out.println("鳴き声は「にゃーにゃー」");
		
	}

	@Override
	void show() {
		System.out.printf("%sは%d歳の%sで、%dキロです\n",getName(),getAge(),getGender(),getWeight());
		
	}
	
	

}
