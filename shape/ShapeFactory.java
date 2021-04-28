package shape;

public class ShapeFactory {
	
	public Shape getInstance(ShapeType type) {
		
		Shape shape = null;
			
		switch(type) 
		{
		
			case CIRCLE:
				shape = new Circle(13);
				break;
				
			case RECTANGLE:
				shape = new Rectangle(10,4);
				break;
				
			
				
			case TRIANGLE:
				shape = new Triangle(6,4);
				break;
				
		}
		
		return shape;
	}	
}
