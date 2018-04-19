
public class Swap_Main
{
public static void main(String args[])
{
	int a=10;int b=2;
	Swap s1= new Swap();
    s1.a=10;s1.b=2;
	s1.swap(s1);
	System.out.println("a ="+" "+s1.a+"b ="+" "+s1.b);
}
}
