package oops.example;

public class Circle extends Shape implements ShapeConstants {
	
	public double radius;
	
	public Circle(){
		this(1);
	}
	public Circle(double radius){
		this.radius=radius;
	}
 // override
	
 public  double calculateArea(){
	 //double temp = Circle.pi;
	 return Circle.pi*Math.pow(radius, 2);
	 
 }
 
 public double calculatePerimeter(){
	 System.out.println(radius);
	 return 2*pi*radius;
	 
 }
 
 /*public setSides(){
	 System.out.println("Print Sides");
}*/


public static void main(String[] args) {
	
    Shape s = new Circle();
	double p1 = s.calculateArea();
	double p2 = s.calculatePerimeter();
	System.out.println(p1);
	System.out.println(p2);
}
}