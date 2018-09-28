package area_Of_Triangle;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {

		// Creating a Triangle class object
		Triangle obj = new Triangle();

		Scanner sc = new Scanner(System.in);
		
		// Taking user input as base and height value
		System.out.println("Enter the base of a triangle :");
		obj.setBase(sc.nextDouble());

		System.out.println("Enter the height of a triangle :");
		obj.setHeight(sc.nextDouble());

		

		// Getting the value for base and height and printing the same
		System.out.println("Base :" + obj.getBase());
		System.out.println("Height :" + obj.getHeight());

		// Calling and printing the Area of a Triangle
		System.out.println("Area of a triangle is " + obj.calcArea());
	}

}
