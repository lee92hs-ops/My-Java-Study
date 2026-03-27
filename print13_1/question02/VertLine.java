package print13_1.question02;

public class VertLine extends AbstLine{
	
	VertLine(int length){
		super(length);
	}
	
	void draw() {
		for(int i = 0; i < getLength(); i++) {
			System.out.println(getVERTLINE());
		}
	}
	

}
