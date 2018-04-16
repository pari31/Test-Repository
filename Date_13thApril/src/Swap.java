
public class Swap {
	int a,b;
	void swap(Swap s)
	{
		s.a= s.a+s.b;
		s.b= s.a-s.b;
		s.a= s.a-s.b;
		System.out.println("A="+s.a+" "+"B="+s.b);
	}
}
