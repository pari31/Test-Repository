import java.util.Arrays;

class swapping {
	public static void main (String args[])
	{
		int arr[]= {5,7,2,1,101,82,3,201};
		for (int i=0;i<arr.length;i++)
		{
			int min=arr [i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
					
				}
			}
			int temp=arr[i];
			arr[i]=min;
			arr[pos]=temp;
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
