package ArrayList;

import java.util.ArrayList;

public class ArraylistProgram1 
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("Anish");
		a1.add("Mandar");
		a1.add("Suresh");
		a1.add("Aditya");
		a1.add("Parmanand");
		a1.add("Ramdev");
		a1.add("Asaram");
		System.out.println("Elements added in Array List are:\n"+a1);
		System.out.println(a1.remove(1)+" Has Been Removed\n"+"Elements After removing an element through an index number\n"+a1);
		System.out.println(a1.remove("Anish")+"\nElement Remove through given name:"+a1);
		ArrayList<String> a2 =new ArrayList<String>();
		a2.add("Akshay");
		a2.add("Shreyas");
		System.out.println(a1.addAll(a2)+" Added other values through addall\n"+a1);
		a1.removeIf(str->str.contains("Aditya"));
		System.out.println("After removing through removeif condition method\n"+a1);
		System.out.println("Let see our Arraylist is empty or not"+a1.isEmpty());
		System.out.println("Removing all elements from the arraylist:"+a1.removeAll(a1)+"\n Arraylist elements are:"+a1+"\n Is empty:"+a1.isEmpty());
	}
}
