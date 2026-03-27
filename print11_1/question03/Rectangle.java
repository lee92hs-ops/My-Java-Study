package print11_1.question03;

public class Rectangle {
	private int yoko;
	private int tate;
	
	public Rectangle(int yoko, int tate) {
		setYoko(yoko);
		setTate(tate);
	}
	
	public int getYoko() {
		return yoko;
	}
	
	public void setYoko(int yoko) {
		this.yoko = yoko;
	}
	
	public int getTate() {
		return tate;
	}
	
	public void setTate(int tate) {
		this.tate = tate;
	}
	
	public int getAreaOfFigure() {
		return getYoko() * getTate();
	}

}
