package ArrayList;

import java.util.ArrayList;

class Student
{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class ArrayListProgram3 
{
	public static void main(String[] args)
	{
		ArrayList<Student> a1=new ArrayList<Student>();
		Student s1=new Student("Anish", 21);
		Student s2=new Student("Mandar", 18);
		Student s3=new Student("Aditya", 20);
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		System.out.println("Elements added in a list through class and it will give the address of the elements"+a1);
		for(Student s:a1)
		{
			System.out.println("Elements added in a list through class" +s.name+ " " +s.age);
		}
	}
}
