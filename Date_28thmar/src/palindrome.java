import java.util.Scanner;
public class palindrome
{
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no."+" ");
		int n= input.nextInt();
		int temp=n;
		int rev;
		int sum=0;
		while(n>0)
		{
			rev= n%10;
			sum=(sum*10)+rev;
			n=n/10;
		}
		if (sum==temp)
		{
			System.out.println("Entered no. is a palindrome");
		}
		else
			System.out.println("Not a palindrome");
	}

}
