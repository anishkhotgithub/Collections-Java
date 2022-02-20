package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListProgram2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Anish");
		a1.add("Mandar");
		a1.add("Suresh");
		a1.add("Aditya");
		a1.add("Parmanand");
		a1.add("Ramdev");
		a1.add("Asaram");
		
		System.out.println("Plzz select any one of it for traversing form");
		System.out.println("1.Traversing list through ListIterator ");
		System.out.println("2.Traversing list through for loop");
		System.out.println("3.Traversing list through forEach Loop");
		System.out.println("4.Traversing list through forEachExpression");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Traversing list through ListIterator and it will be in reverse order ");
			ListIterator<String> li=a1.listIterator(a1.size());
			while(li.hasPrevious())
			{
				String str=li.previous();
				System.out.println(str);
			}
			break;
		case 2:
			System.out.println("Traversing list through for loop");
			for(int i=0;i<a1.size();i++)
			{
				System.out.println(a1.get(i));
			}
			break;
		case 3:
			System.out.println("Traversing list through forEach Loop");
			a1.forEach(a->
			{
				System.out.println(a);
			});
			break;
		case 4:
			System.out.println("Traversing list through forEachExpression");
			Iterator<String> itr=a1.iterator();
			itr.forEachRemaining(a->
			{
				System.out.println(a);
			});
			break;
		default :
			System.out.println("Not in a range");
	}
	}
}
