package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram3 
{
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anish");
		l1.add("Mandar");
		l1.add("Parmanand");
		l1.add("Omkar");
		l1.add("Gauresh");
		l1.add("Janesh");
		l1.add("yuviresh");
		System.out.println(l1);
		//converting linkedlist to arraylist
		List<String> list=new ArrayList<String>(l1);
		for(String s:list)
		{
			System.out.println(s);
		}
		
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("Anish");
		l2.add("Mandar");
		l2.add("Parmanand");
		l2.add("Aditya");
		
		System.out.println("Second Linkedlist values are:"+l2);
		LinkedList<String> l3=new LinkedList<String>();
		for(String s2:l1)
		{
			l3.add(l2.contains(s2)? "yes":"no");
		}
		System.out.println("Comparing linkedlist 1 with linkedlist 2:\n"+l3);
	}
}
