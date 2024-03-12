//SIMPLE FACTORY - Example 2
interface Shape {
	public void draw();
}

class Square implements Shape{
	public Square() {
		
	}
	
	@Override
	public void draw() {
		System.out.println("Draw a Square.");
	}
}

class Circle implements Shape{
	public Circle() {
		
	}
	
	@Override
	public void draw() {
		System.out.println("Draw a Circle.");
	}
}

class ShapeFactory{
	public ShapeFactory() {
		
	}
	
	public static Shape createShape(String param) {
		if("Square".equalsIgnoreCase(param)) {
			return new Square();
		}else if("Circle".equalsIgnoreCase(param)) {
			return new Circle();
		}else {
			throw new IllegalArgumentException("We can either draw a square or a circle!");
		}
	}
}


public class SimpleFactoryEx2 {
	public static void main(String[] args) {
		Shape square = ShapeFactory.createShape("Square");
		Shape circle = ShapeFactory.createShape("Circle");
		
		square.draw();
		circle.draw();
	}
}