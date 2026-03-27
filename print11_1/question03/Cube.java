package print11_1.question03;

public class Cube extends Rectangular{
	public Cube(int ippen) {
		super(ippen, ippen, ippen);
	}
	
	public int getAreaOfFigure() {
		return getYoko() * getTate() * 6;
	}

}
