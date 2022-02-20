package List;

import java.util.ArrayList;
import java.util.List;

interface Hello
{
	void display();
}
class Hello2<E> implements Hello
{
	public void display()
	{
		List<String> a1=new ArrayList<String>();
		a1.add("Anish");
		a1.add("Mandar");
		System.out.println(a1);
	}
}
public class List2 
{
	public static void main(String[] args)
	{
		Hello2 h2=new Hello2();
		h2.display();
	}
}
