
public class sample_abc implements sample_interface,sample_b
{

	public static void main (String arg[])
	{
		sample_interface ob_1 = new sample_abc();
		sample_b ob_2 = new sample_abc();
		ob_1.sum1();
		ob_2.sum2();
		ob_1.display();
		ob_1.div();
		ob_2.multi();
		ob_2.print();
	}

	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("print");
	}

	@Override
	public void multi()
	{
		// TODO Auto-generated method stub
		System.out.println("multi");
	}

	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	@Override
	public void div() 
	{
		// TODO Auto-generated method stub
		System.out.println("div");
	}

	
}
