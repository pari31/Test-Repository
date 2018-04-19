
public class Employee {
int emp_id;
String emp_name;
static String company_name="TCS";
static void change_Company()
{
	company_name= "IBM";
}
void emp(int emp_id,String emp_name)
{
	this.emp_id= emp_id;
	this.emp_name=emp_name;
	}
void display()
{
	System.out.println("emp_id = "+emp_id);
	System.out.println("emp_name = "+emp_name);
	System.out.println("company_name = "+company_name);
}
}

