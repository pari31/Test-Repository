package test;

import java.util.Scanner;

import test1.Calc;

public class abc {
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		Calc obj =new Calc();
		System.out.println("MENU");
		System.out.println("1) Add");
		System.out.println("2) Sub");
		System.out.println("3) Mul");
		System.out.println("4) Div");
		System.out.println("5) Mod");
		System.out.println("Enter Choice");
		int choice=input.nextInt();
		System.out.println("Enter two nos.");
		switch(choice)
		{
		case 2:obj.Sub(input.nextInt(),input.nextInt());
		break;
		case 3:obj.Mul(input.nextInt(),input.nextInt());
		break;
		case 4:obj.Div(input.nextInt(),input.nextInt());
		break;
		case 5:obj.Mod(input.nextInt(),input.nextInt());
		break;
				
		}
		
		
		
		
	}

}
