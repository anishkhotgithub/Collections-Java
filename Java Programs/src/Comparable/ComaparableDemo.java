package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ComaparableDemo 
{
	public static void main(String[] args)
	{
		Students s1=new Students("Anish", 87);
		Students s2=new Students("Mandar", 67);
		Students s3=new Students("Aditya", 93);
		
		ArrayList<Students> a1=new ArrayList<Students>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		ListIterator ltr=a1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		Collections.sort(a1);
		System.out.println("After Sorting the data :");
		ListIterator ltr2=a1.listIterator();
		while(ltr2.hasNext())
		{
			System.out.println(ltr2.next());
		}
	}
}
