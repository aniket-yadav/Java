//interface name exam
interface Exam
{
	void percent_cal();
}
//class name Student
class Student
{
	String name;
	int roll_no,mark1,mark2;
	Student(String n, int r, int m1, int m2)
	{
		name=n;
		roll_no=r;
		mark1=m1;
		mark2=m2;
	}
	void display()
	{
		System.out.println ("Name of Student: "+name);
		System.out.println ("Roll No. of Student: "+roll_no);
		System.out.println ("Marks of Subject 1: "+mark1);
		System.out.println ("Marks of Subject 2: "+mark2);
	}
}

// class Result inheriting Student class and Exam interface

class Result extends Student implements Exam
{
	Result(String n, int r, int m1, int m2)
	{
		super(n,r,m1,m2);
	}
	public void percent_cal()
	{
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println ("Percentage: "+percent+"%");
	}
	
}
class demoMultipleInheritance
{
	public static void main(String args[])
	{
		Result R = new Result("Aniket",59,93,84);
		R.display();
		R.percent_cal();
	}
}


