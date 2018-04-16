import java.util.Scanner;
public class array {
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter no. of elements:"+" ");
	int n=input.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter elements :"+" ");
	for(int i=0;i<=9;i++);
	{
	arr[i]=input.nextInt();
		
	}
	 for(int i : arr)
	 {
		 System.out.print(i);
	 }
}
}
