package print13.questions01;

public class Main {
	
	public static void main(String[] args) {
		
		Animal[] doubutu = new Animal[2];
		
		doubutu[0] = new Cat("たま","雌",7,3);
		doubutu[1] = new Dog("シロ","雄",5);
		
		for(int i=0;i<doubutu.length;i++) {
			doubutu[i].show();
			doubutu[i].cry();
			if(doubutu[i] instanceof Dog) {
				Dog d = (Dog)doubutu[i];
				d.walk();
			}
		}
	}

}
