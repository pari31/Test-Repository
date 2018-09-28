package employee;

public class Employee {
int empId;
String empName;
float salary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int em_Id) {
	empId=(em_Id>0)?em_Id:1;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String em_Name) {
		this.empName = em_Name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float sal) {
	salary=(sal>0)?sal:1;
	
}
public float calcSalary() {
	
	float da=this.salary*15/100;
	float hra=this.salary*10/100;
	float gross_sal=this.salary+da+hra;
	
	return gross_sal;
}
}
