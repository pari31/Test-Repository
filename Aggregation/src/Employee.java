
public class Employee
{
int id;
String name;
Address a;
public  Employee(int id,String name,Address a)
{
	this.id =id;
	this.name =name;
	this.a =a;
}
void disp()
{
	System.out.print(id+" "+name+" ");
	System.out.println(a.city+" "+a.state+" "+a.country);
}

public static void main(String args [])
{
	Address add1=new Address("Noida","UP","India");
	Address add2=new Address("Lko","UP","India");
	Employee emp1=new Employee(101,"Amit",add1);
	Employee emp2=new Employee(102,"Paritosh",add2);
	emp1.disp();
	emp2.disp();

}
}
