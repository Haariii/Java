package week5;

public class Circle extends Shape {
	protected double radius = 1.0;
	protected double PI = 3.14;
	
	public Circle() {}	
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	public double getPerimeter() {
		return 2 * PI * radius;
	}
	
	@Override
	public String toString() {
		return super.toString() + "radius: " + radius + "\n";
	}
}	
