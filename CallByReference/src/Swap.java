
public class Swap
{
int a;int b;
public void swap(Swap s)
{
	s.a=s.a+s.b;
	s.b=s.a-s.b;
	s.a=s.a-s.b;
	System.out.println("a ="+" "+s.a+"b ="+" "+s.b);
	
}

}
