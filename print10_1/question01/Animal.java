package print10_1.question01;

public class Animal {
	
	private String kind;
	private String name;
	private String cry;
	private int age;
	
	public Animal() {
		
	}
	
	public Animal(String kind, String name, String cry, int age) {
		setKind(kind);
		setName(name);
		setCry(cry);
		setAge(age);
		
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getCry() {
		return cry;
	}
	
	public void setCry(String cry) {
		this.cry = cry;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.printf("%sの種類は%sで, 年齢は%dで, 鳴き声は%s\n",getName(), getKind(), getCry(), getAge());
		
	}
	

}
