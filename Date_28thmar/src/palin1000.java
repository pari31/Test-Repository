
public class palin1000 {
	
	
	public static void main(String args[])
	{
		System.out.print("Palindrome nos.are"+" ");
		for(int i=1;i<=1000;i++)
		{
			int rev;
			int sum=0;
			int num=i;
			
			while(num>0)
			{
				rev= num%10;
				sum= (sum*10)+rev;
				num=num/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			
			}
		}
	}
}