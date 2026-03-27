package print10_1.question03;

public class Person {
	
	private String name;
	private int age;
	private int gender;
	private String hobby;
	
	Person(String name, int age, int gender){
		setName(name);
		setAge(age);
		setGender(gender);
	}
	
	Person(String name, int age, int gender, String hobby){
		this(name,age, gender);
		setHobby(hobby);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getGender() {
		return gender;
	}
	
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void show() {
		String str = "";
		if(getGender() == 0) {
			str = "男性";
		}else {
			str = "女性";
		}
		System.out.printf("%sの性別は%sで、年齢は&d歳、趣味は%s", getName(), str,getAge(), getHobby());
	}
	
	public boolean hasSameName(String name) {
		if(getName().equals(name)) {
			return true;
		}
		return false;
	}

}
