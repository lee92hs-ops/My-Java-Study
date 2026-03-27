package print11_1.question02;

public class Dog extends Animal{
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void run() {
		System.out.println("トコトコ");
	}
	
	public void speak() {
		System.out.println("ワンワン");
	}

}
