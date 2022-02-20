package ArrayList;

import java.util.ArrayList;
//CRUD	
public class ArrayListProgram4 
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
		System.out.println("Elements in the arraylist are:\n"+a1);
		a1.add(1,"Prakash");
		System.out.println("Elements after updating through index value:\n"+a1);
		a1.remove(1);
		System.out.println("Removing range\n");
		System.out.println("Removing the elements through index number now values are:\n"+a1);
		a1.remove("Anish");
		System.out.println("Removing the elements through passing name in parameter  values are:\n"+a1);
		a1.removeAll(a1);
		//a1.clear(); It can remove all the elements instance
		System.out.println("Removing all the elements now arraylist would be:\n"+a1);
	}
}
