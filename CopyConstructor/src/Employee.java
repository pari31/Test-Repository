
public class Employee {
int emp_id;
String emp_name;
static String emp_companyName= "Fortis";
Employee(int id,String name)
{
	this.emp_id=id;
	this.emp_name=name;
}
Employee (Employee emp)
{
	this.emp_id=emp.emp_id;
	this.emp_name=emp.emp_name;
}
void disp ()
{
System.out.println("emp_id="+" "+emp_id+" "+"emp_name="+" "+emp_name+" "+"emp_companyName="+" "+emp_companyName);
}
}
