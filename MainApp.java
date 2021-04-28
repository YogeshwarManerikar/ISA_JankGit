package shape;

import java.util.Scanner;


public class MainApp {
	
public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		ShapeFactory shapefactory = new ShapeFactory();
				
		System.out.println(" Enter the Shape you want to draw and calculate area ");
        System.out.println("1) Rectangle");
        System.out.println("2) Square ");
        System.out.println("3) Circle ");
        System.out.println("4) Triangle");
        System.out.println("5) Exit ");
   
        int choice = s.nextInt();
		
        switch(choice) 
        {
        	case 1:
        		Shape rectangle = shapefactory.getInstance(ShapeType.RECTANGLE);
        		rectangle.draw();
        		System.out.println("Area of Rectangle is "+rectangle.calculateArea());
        		
        		Shape rectangle2 = rectangle.getClone();
        		rectangle2.draw();
        		System.out.println("Area of Rectangle is "+rectangle2.calculateArea());
        		break;
        	
        	case 2:
        		Shape square = shapefactory.getInstance(ShapeType.SQUARE);
        		square.draw();
        		System.out.println("Area of Square is "+square.calculateArea());
        		
        		Shape square2 = square.getClone();
        		square2.draw();
        		System.out.println("Area of Square is "+square2.calculateArea());
        		break;
        		
        	case 3:
        		Shape circle = shapefactory.getInstance(ShapeType.CIRCLE);
        		circle.draw();
        		System.out.println("Area of Circle is "+circle.calculateArea());
        		
        		Shape circle2 = circle.getClone();
        		circle2.draw();
        		System.out.println("Area of Circle is "+circle2.calculateArea());
        		break;
        			
        	case 4:
        		Shape triangle = shapefactory.getInstance(ShapeType.TRIANGLE);
        		triangle.draw();
        		System.out.println("Area of Triangle is "+triangle.calculateArea());
        		
        		Shape triangle2 = triangle.getClone();
        		triangle2.draw();
        		System.out.println("Area of Triangle is "+triangle2.calculateArea());
        		break;
        		
        	case 5:
        		break;
        	
        	default:
        		System.out.println("Enter valid option");
        		break;
        }
        
        
        s.close();
        
	}
}
