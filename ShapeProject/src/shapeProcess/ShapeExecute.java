package shapeProcess;
import java.util.Scanner;

import shapePack.*;

public class ShapeExecute {
	
	public static void main(String args[]) {
		
		Scanner myScanner = new Scanner(System.in);
		
		Square square = new Square();
		SemiCircle semicircle = new SemiCircle();
		
		square.printSquare();
		square.printRectangle();
		square.printShape();
		
		System.out.println("----------------");
		System.out.println("Area of a Square");
		System.out.println("Enter the measure of a side: ");
		int input = myScanner.nextInt();
		System.out.println("RESULT: Area of Square= " + square.calculateArea(input));
		
		System.out.println("----------------");
		System.out.println("Area of a Rectangle");
		System.out.println("Enter the measure of length: ");
		int length = myScanner.nextInt();
		System.out.println("Enter the measure of width: ");
		int width = myScanner.nextInt();
		System.out.println("RESULT: Area of Rectangle= " + square.calculateArea(length, width));
		
		System.out.println("----------------");
		
		semicircle.printShape();
		semicircle.printCircle();
		semicircle.printSemiCircle();
		
		myScanner.close();
		
	}
	
	

}
