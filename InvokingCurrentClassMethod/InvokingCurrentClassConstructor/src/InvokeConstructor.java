
public class InvokeConstructor {
int code;
String name;
float income;
String emailid;
	InvokeConstructor(int c,String n)
{
	this.code=c;
	this.name=n;
	System.out.print("code"+" "+c+" ");
	System.out.print("name"+" "+n+" ");
}
	InvokeConstructor(float i)	
	{
		this(201,"Tim");
		this.income=i;
		System.out.print("income"+" "+i+" ");
		
	}
	InvokeConstructor(String email)
	{
		this(10000);
		this.emailid=email;
		System.out.println("Email_id = "+" "+email);
	}
	
}
