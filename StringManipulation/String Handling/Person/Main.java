import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		Person p1 = new Person();
		Person obj = p1.buildPerson(str);
		String grade = p1.findGrade(obj);	

		System.out.println("Grade = "+grade);
	}
}

class Person
{
	private String loc;
	private String name;
	private double salary;
	
	public Person(String loc,String name,double salary)
	{
		this.loc = loc;
		this.name = name;
		this.salary = salary;
	}
	
	public Person()
	{
	
	}
	
	public String getLoc()
	{
		return loc;	
	}

	public String getName()
	{
		return name;	
	}
	
	public double getSalary()
	{
		return salary;	
	}
	
	public void setLoc()
	{
		loc = loc;
	}

	public void setName()
	{
		name = name;
	}

	public void setSalary()
	{
		salary = salary;
	}

	public Person buildPerson(String str)
	{
		String loc = "",name = "",sal = "";
		double salary = 0.0;
		
		StringTokenizer st1 = new StringTokenizer(str,"NM");
		
		while(st1.hasMoreTokens())
		{
			loc = st1.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"SAL");

			while(st2.hasMoreTokens())
			{
				name = st2.nextToken();
				sal = st2.nextToken();
			}	salary = Double.parseDouble(sal)*1000;					
		}
		return new Person(loc,name,salary);
	}

	public String findGrade(Person person)
	{
		String grade = "";
		
		if(person.salary < 10000)
			grade = "C";
		else if(person.salary >=10000 && person.salary<=25000)
			grade = "B";
		else if(person.salary > 25000)
			grade = "A";

		return grade;
	}
}