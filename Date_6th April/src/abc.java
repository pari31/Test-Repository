import java.util.Scanner;

public class abc {
	public static void main(String args[])
	{
		System.out.println("Enter two nos.");
		
		Scanner sc =new Scanner(System.in);
		Calc obj =new Calc();
		input ob= new input();
		ob.setA(sc.nextInt());
		ob.setB(sc.nextInt());


		obj.Add(ob.getA(),ob.getB());
		
		obj.Sub(ob.getA(),ob.getB());
		
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
