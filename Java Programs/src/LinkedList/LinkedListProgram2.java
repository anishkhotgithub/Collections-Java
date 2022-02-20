package LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProgram2 
{
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anish");
		l1.add("Mandar");
		l1.add("Suresh");
		l1.add("Pranesh");
		l1.add("Mayuresh");
		l1.add("Omkar");
		l1.add("Gauresh");
		l1.add("Janesh");
		l1.add("yuviresh");
		ListIterator<String> li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		l1.remove(1);
		System.out.println(l1);
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("Parmanad");
		l2.add("Prakash");
		l1.addAll(l2);
		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.removeFirstOccurrence("Janesh");
		System.out.println(l1);
		l1.removeLastOccurrence("Omkar");
		System.out.println(l1);
		Collections.swap(l1, 0, 2);
		System.out.println(l1);
		l1.set(1, "Anish");
		System.out.println(l1);
	}
}
