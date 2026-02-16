package print14.questions01;

public class Rectangle implements Shape{

	
	private double width;
	private double height;
	
	Rectangle(double width,double height){
		setWidth(width);
		setHeight(height);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {

		return getWidth() * getHeight();
	}
	@Override
	public double getPerimeter() {

		return 2 * (getWidth() + getHeight());
	}
	@Override
	public void show() {
		
		System.out.println("矩形の面積は" + getArea());
		System.out.println("矩形の周囲長は" + getPerimeter());
	}
	
}
