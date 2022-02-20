package Sets;

import java.util.LinkedHashSet;

class Student
{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
}
public class LinkedHashSet2 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Student> lhs =new LinkedHashSet<Student>();
		Student s1=new Student(1, "Anish");
		Student s2=new Student(2, "Viral");
		
		lhs.add(s1);
		lhs.add(s2);
		
		for(Student s:lhs)
		{
			System.out.println(s.rollno+" "+s.name+" ");
		}
	}
}
