package basics;

public class Circle extends Shape {
	// data fields
	private double radius;
	
	// constructor
	public Circle(double radius, String color) {
		super(color);
		this.radius = radius;
	}
	
	// methods
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public String string_of() {
		return "Circle: r "+radius;
	}

//	public String toString() {
//		return "Circle: r "+radius+", c "+this.getColor();
//	}

	
}
