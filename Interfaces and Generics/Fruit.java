package basics;

public abstract class Fruit implements Colorable {
	// data field
	private String fruitColor;

	public Fruit(String fruitColor) {
		super();
		this.fruitColor = fruitColor;
	}

	public String getColor() {
		return fruitColor;
	}

	public void setColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	
	
}
