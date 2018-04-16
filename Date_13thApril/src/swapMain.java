
public class swapMain {
	public static void main(String args[])
	{
		int a=5;int b=2;
		Swap s1=new Swap();
		s1.a=5;s1.b=2;
		s1.swap(s1);
		System.out.println("A="+s1.a+" "+"B="+s1.b);
	}
}
