package basics;

/**
 * This class models rectangles
 * @author ebonelli
 *
 */
public class Rectangle extends Shape {
	// data fields
	private double height;
	private double width;
	private static int NOR;
	
	// constructor
	Rectangle() {
		this(0.0,0.0,"Green");
	}
	
	/**
	 * Constructs a new rectangle
	 * @param height The height of the rectangle
	 * @param width The width of the rectangle
	 */
	Rectangle(double height, double width) {
		this(height,width,"Green");
	}

	Rectangle(double height, double width, String color) {
		super(color);
		this.height=height;
		this.width=width;
		NOR++;
	}

	// methods
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	/*
	 * This method sets the height of a rectangle
	 * It should receive a double as parameter
	 */
	public void setHeight(double height) {
		this.height = height;
	}
		
	public void setWidth(double w) {
		width = w;
	}
	
	public static int get_NOR() {
		return NOR;
	}
	
	public double area() {
		return width*height;
	}
	
	public String string_of() {
		return "Rectangle: w "+width+", h "+height;
	}
	
//	public String toString() {
//		return "Rectangle: w "+width+", h "+height+", c "+this.getColor();
//	}
	
}
