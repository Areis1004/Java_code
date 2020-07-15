import java.util.*;
abstract class Employee 
{
	private int empid;
	private String empname;
	protected Scanner sc;
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
	System.out.println("Please Enter employee id ");
	empid=sc.nextInt();
	System.out.println("Employee name");
	empname=sc.next();

	}
	public void display()
	{
	System.out.println("Details are "+empid+"   "+empname);
	}
	public abstract void calculateSalary();
	public abstract void calculateLeave();

	
}
 class PEmployee extends Employee
{
		private double salary;
		public void accept()
		{
		super.accept();
		System.out.println("Enter salary");
		salary=sc.nextDouble();
		}
		public void display()
		{
		super.display();
		System.out.println("Salary is "+salary);
		}
		public void calculateSalary()
		{
		System.out.println("Calculating salary for permanent employee");
		}
		public void calculateLeave()
		{
		}
}
class TEmployee extends Employee
{
		private int contractperiod;
		public void accept()
		{
		super.accept();
		System.out.println("Contract period ");
		contractperiod=sc.nextInt();
		}
		public void display()
		{
		super.display();
		System.out.println("contract period is "+contractperiod);
		}
		public void calculateSalary()
		{
		System.out.println("Calculating salary for temp employee");
		}
		public void calculateLeave()
		{
		}
public static void main(String arg[])
	{
		Employee e1;
		e1=new PEmployee();
		e1.accept();
		e1.display();
		e1.calculateSalary();
		e1=new TEmployee();
		e1.accept();
		e1.display();
		e1.calculateSalary();
		
	}
}
