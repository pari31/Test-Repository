import java.util.Scanner;
public class Implement implements interfaece {

private	Scanner input= new Scanner(System.in);
private	Abs obj= new Abs();
	@Override
	public void holdData() {
		System.out.println("Enter emp_id : "+" ");
		obj.setEmp_id(input.nextInt());
		System.out.println("Enter emp_bonus : "+" ");
		obj.setEmp_bonus(input.nextInt());
		System.out.println("Enter emp_salary : "+" ");
		obj.setEmp_salary(input.nextFloat());
		System.out.println("Enter emp_name: "+" ");
		obj.setEmp_name(input.next());
		System.out.println(" ");
	}

	@Override
	public void printData() {
		System.out.println("Emp_id is:"+" "+obj.getEmp_id());
		System.out.println("Emp_bonus is:"+" "+obj.getEmp_bonus());
		System.out.println("Emp_salary is:"+" "+obj.getEmp_salary());
		System.out.println("Emp_name is:"+" "+obj.getEmp_name());
				
	}

}
