package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram1
{
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anish");
		l1.add("Pranesh");
		l1.add("Mayuresh");
		System.out.println(l1);
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
