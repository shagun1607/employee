class employee
{
	String name, address;
	int year, salary;
	public employee(String n, int y, int sal, String add)
	{
		name=n;
		year=y;
		salary=sal;
		address=add;
	}
	public String getname()
	{return name;}
	public int getyear()
	{return year;}
	public int getsalary()
	{return salary;}
	public String getaddress()
	{return address;}
}
public class Emp
{
  public static void main(String[] args)
  {
  employee e1=new employee("Robert", 1994, 30000, "64C-WallsStreet");
  employee e2=new employee("Sam", 2000, 35000, "68D-WallsStreet");
  employee e3=new employee("John", 1999, 40000, "26B-WallsStreet");
  System.out.println("Name\tYear Of Joining\t\tSalary\tAddress");
  System.out.println(e1.getname()+"\t"+e1.getyear()+"\t\t\t"+e1.getsalary()+"\t"+e1.getaddress());
  System.out.println(e2.getname()+"\t"+e1.getyear()+"\t\t\t"+e1.getsalary()+"\t"+e1.getaddress());
  System.out.println(e1.getname()+"\t"+e1.getyear()+"\t\t\t"+e1.getsalary()+"\t"+e1.getaddress());
  }
}
