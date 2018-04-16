import java.util.Scanner;

public class Cmain {
public static void main(String args[])
{
	Scanner input =new Scanner(System.in);
	Rec obj= new Rec();
	System.out.println("Enter the no. to find its factorial :"+" ");
		System.out.println("The factorial is"+" "+obj.fa(input.nextInt()));
	
}
}
