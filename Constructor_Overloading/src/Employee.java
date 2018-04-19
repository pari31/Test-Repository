
public class Employee {
String emp_name;
int emp_age;
int emp_id;
int bonus;
float salary;
String email_id;
Employee(String emp_name,String email_id)
{
this.emp_name=emp_name;
this.email_id=email_id;
}
Employee(int emp_age,int emp_id,int bonus,float salary)
{
	this.emp_age=emp_age;
	this.emp_id=emp_id;
	this.bonus=bonus;
	this.salary=salary;
	
}
void disp()
{
	System.out.print("emp_name ="+" "+emp_name+" "+"email_id ="+" "+email_id);
	
}
void disp1()
{
	System.out.print("emp_age ="+" "+emp_age+" "+"emp_id ="+" "+emp_id+" "+"emp_bonus ="+" "+bonus+" "+"emp_salary ="+" "+salary);
}
}
