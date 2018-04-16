package devops;

public class arm 
{
public static void main(String args[])
{
	
	
	for (int i=1;i<=1000;i++)
	{
		int s=0;
		                                                                                       
		int d=0;
		int n=i;
		while(n>0)
		{
			d=(n%10);
			s=s+(d*d*d);
			n=n/10;
		}
		
	
                        if (i==s)
		{
			System.out.println(s+" "+"is"+" "+"Armstrong No.");
		}
		
		
                        
	}
}

}
