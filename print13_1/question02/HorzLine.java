package print13_1.question02;

public class HorzLine extends AbstLine{
	
	HorzLine(int length){
		super(length);
	}
	
	void draw() {
		for(int i = 0; i < getLength(); i++) {
			System.out.println(getHORZLINE());
		}
		System.out.println();
	}

}
