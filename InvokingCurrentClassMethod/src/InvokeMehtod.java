
public class InvokeMehtod {
int id;
String name;
String maiil_id;
	void method1(int id,String name)
{
	this.id=id;
	this.name=name;
		
}
	void method2(String m)
	{
		this.method1(id,name);
		this.maiil_id=m;
		
	}
	void disp()
	{
		System.out.print("emp_id = "+id+" ");
		System.out.print("emp_name = "+name+" ");
		
	}
	void disp1()
	{
		System.out.println("emp_mailid= "+maiil_id+" ");
	}
}
