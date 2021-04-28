package shape;

public class Rectangle implements Shape{
	
	private double length;
	private double breath;
	
	public Rectangle(){				//constructor
		this.length = 0;
		this.breath = 0;
	}
	
	public Rectangle(double length,double breath) {				//constructor
		this.length = length;
		this.breath = breath;
	}
	
	public void draw() {										//method to draw shape
	      System.out.println("Drawing Rectangle");
	}


	public double calculateArea() {								//method to calculate Area
		return this.length*this.breath;
	}
	
	public Shape getClone() {									//method to clone an object
		return new Rectangle(this.length,this.breath);
	}

	//getters and setters
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}
	
	
}
