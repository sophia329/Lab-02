package shapePack;


public class Square extends Rectangle {
	
	public void printSquare() {
		
		System.out.println("This is Square. Subclass of Rectangle");
	}
	
	public int calculateArea(int side) {
		int squareArea;
		squareArea = side * side;
		return squareArea;
	}
}