package shapePack;


public class Rectangle extends Shape {
	
		public void printRectangle() {
			
			System.out.println("This is Rectangle. Subclass of Shape");
		}
		
		public int calculateArea(int length, int width) {
			int rectangleArea;
			rectangleArea = length * width;
			return rectangleArea;
		}
	}


