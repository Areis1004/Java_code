import java.util.*;
class Employee
{
	protected Scanner sc;
	private int empid;
	private String empname;
	public Employee()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		System.out.println("Enter Employee id ");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name");
		empname=sc.next();
	}
	public void display()
	{
		System.out.println("Details "+empid+"  "+empname);
	}

	
}
public class PermanentEmployee extends Employee
{
		private double salary;
		public PermanentEmployee()
		{
		}
		public void accept()
		{
			super.accept();
			System.out.println("Please Enter Salary");
			salary=sc.nextDouble();
		}
		public void display()
		{
			super.display();
			System.out.println("Salary is "+salary);
		}
		public static void main(String arg[])
		{
			System.out.println("Employee Details ");
			Employee e1=new Employee();
			e1.accept();
			e1.display();
			PermanentEmployee p1=new PermanentEmployee();
			p1.accept();
			p1.display();
		}
`
	
}