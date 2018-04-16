
public class Rec {
 int fa(int n)
{
	if (n==1||n==0)
	{
		return 1;
	}
	else
	{
		return(n*(fa(n-1))) ;
	}
}
}
