package print13.questions02;

public class VertLine extends AbstLine{

	VertLine(int length) {
		super(length);
	}

	@Override
	void draw() {
		for(int i=0;i<getLength();i++) {
			System.out.println(getVERTLINE());
		}
	}

	
}
