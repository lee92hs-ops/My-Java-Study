package print13.questions02;

public abstract class Shape {
	
	private final String SYMBOL = "+";
	private final String HORZLINE = "-";
	private final String VERTLINE = "|";
	
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
