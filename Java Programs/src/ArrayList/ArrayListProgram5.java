package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram5
{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		String n = null;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			System.out.println("Enter the Element to add in arrayList");
			n=sc.next();
			a1.add(n);
		}
		
		System.out.println(a1);
		a1.remove(1);
		System.out.println("Removing value through index value:\n"+a1);
	}
	
}
