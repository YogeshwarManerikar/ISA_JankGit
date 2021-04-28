package shape;

public class Triangle implements Shape{

	private double base;
	private double height;
	
	public Triangle() {		//constructor
		
		this.base = 0;
		this.height = 0;
	}
	
	public Triangle(double base,double height){			//constructor
		this.base = base;
		this.height = height;
	}
	
	
	public void draw() {								//method to draw shape
	      System.out.println("Drawing Triangle");
	}
	
	public double calculateArea() {						//method to calculate Area
		return 0.5*this.base*this.height;
	}
	
	public Shape getClone() {							//method to clone an object
		return new Triangle(this.base,this.height);
	}
	
	//getters and setters
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}
