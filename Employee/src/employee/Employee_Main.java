package employee;

import java.util.Scanner;



public class Employee_Main {

	public static void main(String[] args) {
		// Creating a Employee class object
				Employee obj = new Employee();

				Scanner sc = new Scanner(System.in);
				
				// Taking user input as Employee Id value
				System.out.println("Enter the Employee Id :");
				obj.setEmpId(sc.nextInt());

				System.out.println("Enter the Employee Name :");
				obj.setEmpName(sc.next());

				System.out.println("Enter the Employee basic salary :");
				obj.setSalary(sc.nextFloat());

				// Getting the value for empId,empName and salary and printing the same
				System.out.println("EmpId :" + obj.getEmpId());
				System.out.println("EmpName :" + obj.getEmpName());
				System.out.println("Salary :" + obj.getSalary());
				// Calling and printing the gross salary
				System.out.println("Gross Salary " + obj.calcSalary());
			}

		

	}

 
