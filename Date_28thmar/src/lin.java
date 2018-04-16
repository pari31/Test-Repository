import java.util.Scanner;
public class lin {
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System .out.println("Enter digit:"+" ");
	int flag=0;
	int arr[]= {10,33,41,52,71,99,117};
	int n=input.nextInt();
	int min=0;
	int max=arr.length-1;
	while(min<=max)
	{
		int mid=(min+max)/2;
		if(arr[mid]==n)
		{
			System.out.println("Number found");
			flag=1;
			break;
		}
		else if(arr[mid]<n)
		{
			min=mid+1;
		}
		else
		{max=mid-1;
		}
		
	}
	if(flag==0)
	{
		System.out.println("Not found");
	}
		
		
	}
	
	
}

