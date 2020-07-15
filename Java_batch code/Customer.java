interface personalDetails
{
	public void acceptName();
	public void acceptAddInfo();
	default void acceptMobileInfo()
	{
		System.out.println("new method added");
	}

}
interface EducationDetails
{
	public void gradInfo();
	public void postGradInfo();
}
class Employee implements personalDetails,EducationDetails
{
	public void acceptName()
	{
		System.out.println("Accepting name");
	}
	public void acceptAddInfo()
	{
		System.out.println("Accepting address info");
	}
	public void gradInfo()
	{
		System.out.println("Accepting graduate info");
	}
	public void postGradInfo()
	{
		System.out.println("Accepting post graduate info");
	}
	public void acceptMobileInfo()
	{
		System.out.println("Accepting mobile info");
	}

}
class Customer implements personalDetails
{
public void acceptName()
	{
		System.out.println("Accepting name");
	}
	public void acceptAddInfo()
	{
		System.out.println("Accepting address info");
	}
public static void main(String arg[])
	{
		Employee e1=new Employee();
		e1.acceptName();
		e1.acceptAddInfo();
		e1.gradInfo();
		e1.postGradInfo();
		
		
		
	}
}