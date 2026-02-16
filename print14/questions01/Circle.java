package print14.questions01;

public class Circle implements Shape{
	
	private double radius;
	
	Circle(double radius){
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
	
		return getRadius() * getRadius() * Math.PI;
	}

	@Override
	public double getPerimeter() {

		return 2 * getRadius() * Math.PI;
	}

	@Override
	public void show() {

		System.out.printf("円の面積は%.2f\n",getArea());
		System.out.printf("円の周囲長は%.2f\n",getPerimeter());
	}
	
	

}
