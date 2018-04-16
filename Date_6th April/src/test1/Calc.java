package test1;

public class Calc
{
	int r;
private void Add(int a,int b)
{
	r=a+b;
	System.out.println(r);
}
public void Sub(int a,int b)
{
	r=a-b;
	System.out.println(r);
	Add(a,b);
}
public void Mul(int a,int b)
{
	r=a*b;
	System.out.println(r);
}
public void Div(int a,int b)
{
	r=a/b;
	System.out.println(r);
}
public void Mod(int a,int b)
{
	r=a%b;
	System.out.println(r);
}
}
