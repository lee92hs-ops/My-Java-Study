package print13_1.question02;

public abstract class Shape {
	private String SYMBOL = "+";
	private String HORZLINE = "-";
	private String VERTLINE = "|";
	
	public String getSYMBOL() {
		return SYMBOL;
	}
	
	public String getHORZLINE() {
		return HORZLINE;
	}
	
	public String getVERTLINE() {
		return VERTLINE;
	}
	
	abstract void draw();

}
