package print11_1.question03;

public class Rectangular extends Rectangle{
	
	private int takasa;
	
	public Rectangular(int yoko, int tate, int takasa) {
		super(yoko, tate);
		setTakasa(takasa);
	}
	
	public int getTakasa() {
		return takasa;
	}
	
	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}
	
	public int getAreaOfFigure() {
		int menseki = 2 * getYoko() * getTate() + 2 * getTate() * getTakasa() + 2 * getYoko() * getTakasa();
		return menseki;
	}
	
	public int getVolume() {
		return getTate() * getYoko() * getTakasa();
	}

}
