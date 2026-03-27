package print13_1.question02;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		setWidth(width);
		setHeight(height);
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	void draw() {
		for(int i = 0; i < getHeight(); i++) {
			for(int j = 0; j < getWidth(); j++) {
				System.out.println(getSYMBOL());
			}
			System.out.println();
		}
	}

}
