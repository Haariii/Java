package week5;

/**
 * this class tests all the cases from ex1 and ex2
 * @author Harri Hoang Tran
 * @since 2018-27-11
 */

public class Main {
	public static void main(String[] args) {
		/**
		 * ex1 test cases
		 * @param cam:QuaCam, tao:QuaTao, cpp:CamCaoPhong, cs:CamSanh
		 */
		System.out.println("EXERCISE 1:\n"); 
		
		QuaCam cam = new QuaCam(12,"Vietnam","Monday",12,"Green");
		System.out.println(cam.toString());
		QuaTao tao = new QuaTao(8,"Africa","Sunday",1,"Pink");
		System.out.println(tao.toString());
		CamCaoPhong cpp = new CamCaoPhong(7,"American","Tuesday",5,"Orange");
		System.out.println(cpp.toString());
		CamSanh cs = new CamSanh(69,"Korea","Saturday",70,"BlackPink");
		System.out.println(cs.toString());
				
		/**
		 * ex2 test cases
		 * @param sh:Shape, c:Circle, r:Rectangle, sq:Square
		 */
		System.out.println("EXERCISE 2:\n");
		
		Shape sh = new Shape("black",true);
		System.out.println(sh.toString());
		sh.setColor("pink");
		sh.setFilled(false);
		System.out.println(sh.toString());
		
		Circle c = new Circle(2);
		System.out.print(c.toString());
		System.out.println("Area: " + c.getArea()); 
		System.out.println("Perimeter: " + c.getPerimeter() + "\n");
		
		Circle cc = new Circle(7,"blackpink",false);
		System.out.print(cc.toString());
		System.out.println("Area: " + cc.getArea()); 
		System.out.println("Perimeter: " + cc.getPerimeter());
		cc.setRadius(12.0);
		cc.setFilled(true);
		cc.setColor("green");
		System.out.print(cc.toString());
		System.out.println("Area: " + cc.getArea()); 
		System.out.println("Perimeter: " + cc.getPerimeter() + "\n");
		
		Rectangle r = new Rectangle(7,12,"black",true);
		System.out.print(r.toString());
		System.out.println("Area: " + r.getArea()); 
		System.out.println("Perimeter: " + r.getPerimeter() + "\n");
		r.setWidth(12);
		r.setLength(69);
		r.setColor("pink");
		System.out.print(r.toString());
		System.out.println("Area: " + r.getArea()); 
		System.out.println("Perimeter: " + r.getPerimeter() + "\n");
		
		Square sq = new Square(70,"white",false);
		System.out.println(sq.toString());
		System.out.println("Area: " + sq.getArea()); 
		System.out.println("Perimeter: " + sq.getPerimeter() + "\n");
		sq.setSide(69);
		sq.setColor("blackpink");
		sq.setFilled(true);
		System.out.println(sq.toString());
		System.out.println("Area: " + sq.getArea()); 
		System.out.println("Perimeter: " + sq.getPerimeter() + "\n");
	}
}
