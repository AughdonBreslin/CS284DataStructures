package basics;

import java.util.Arrays;

public class PlayingWithShapes {

	public static void print_area(Shape r) {
		System.out.println("The area is "+r.area());
	}
	
	
	public static String[] colors(Colorable[] shs) {
		String[] ss = new String[shs.length];
		int i=0;
		for (Colorable s:shs) {
			ss[i] = s.getColor();
			i++;
		}
		return ss;
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
		
		Shape[] ss = new Shape[3];
		ss[0]=r1;
		ss[1]=r2;
		ss[2]=c1;
		
		Fruit[] fs = new Fruit[3];
		fs[0] = new Apple("Red",2);
		fs[1] = new Apple("Green",7);
		fs[2] = new Apple("Red",5);
		
		Colorable[] cs = new Colorable[6];
		cs[0]=r1;
		cs[1]=r2;
		cs[2]=c1;
		cs[3] = new Apple("Red",2);
		cs[4] = new Apple("Green",7);
		cs[5] = new Apple("Red",5);

		System.out.println(Arrays.toString(colors(ss)));

		System.out.println(Arrays.toString(colors(fs)));

		System.out.println(r2.colorAndHeight().getX());
		
		r2.m1(2);
	}
	
	
	
}
