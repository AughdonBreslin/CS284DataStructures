package basics;

public class PlayingWithShapes {

	public static void print_area(Shape r) {
		System.out.println("The area is "+r.area());
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3.2,4.3);
		Rectangle r3 = new Rectangle(1.4,4.7, "Blue");
		
		print_area(r2);
		
		System.out.println(r1.getWidth());
		System.out.println(r2.getHeight());
		System.out.println(r3.getColor());
		System.out.println(r1.getColor());
		System.out.println(r3.area());
		
		System.out.println(Rectangle.get_NOR());
		
		Circle c1 = new Circle(3.4, "Orange");
		
		print_area(c1);
		
		System.out.println(c1.getColor());
		System.out.println(c1.area());
		
		System.out.println(r2);
		System.out.println(c1);
				
			
	}
	
	
	
}
