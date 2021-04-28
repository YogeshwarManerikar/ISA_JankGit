package shape;

public class Circle implements Shape{
	
	private double radius;
	
	public Circle(){				//constructor
		this.radius = 0;
	}
	
	public Circle(double radius){	//constructor
		this.radius = radius;
	}
	
	public void draw() {					//method to draw shape
	      System.out.println("drawing Circle");
	}
	
	public double calculateArea() {			//method to calculate Area
		return 3.14*this.radius*this.radius;
	}
	
	public Shape getClone() {				//method to clone an object
		return new Circle(this.radius);
	}

	//getters and setters
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
