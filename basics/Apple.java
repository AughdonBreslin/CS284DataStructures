package basics;

public class Apple extends Fruit {
	// data fields
	private int acidityLevel;

	public Apple(String fruitColor, int acidityLevel) {
		super(fruitColor);
		this.acidityLevel = acidityLevel;
	}

	public int getAcidityLevel() {
		return acidityLevel;
	}

	public void setAcidityLevel(int acidityLevel) {
		this.acidityLevel = acidityLevel;
	}
	
	
}
