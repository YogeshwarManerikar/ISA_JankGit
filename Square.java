package shape;

public class Square implements Shape{
	
	private double length;
	
	public Square()							//constructor
	{
		this.length = 0;
	}
	
	public Square(double length) {				//constructor
		this.length = length;
	}
	
	public void draw() {						//method to draw shape
	      System.out.println("Drawing Square");
	}
	
	public double calculateArea() {				//method to calculate Area
		return this.length*this.length;
	}

	public Shape getClone() {					//method to clone an object
		return new Square(this.length);
	}
	
	
	//getters and setters
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
}
