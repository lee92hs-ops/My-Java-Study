package sukkiri.chapter11.practice02;

public abstract class TangibleAsset extends Asset{
	String color;
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	public String getColor() {return this.color;}

}
