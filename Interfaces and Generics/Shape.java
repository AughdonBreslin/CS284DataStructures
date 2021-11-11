package basics;

public abstract class Shape implements Colorable {
	// data fields
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double area();
	
	public abstract String string_of();
	
	public String toString() {
		return this.string_of()+"c "+color;
	}
	
	
}
