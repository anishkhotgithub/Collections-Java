package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
 
public class Map1 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(101, "Anish");
		m.put(102, "Mandar");
		m.put(103, "Aditya");
		m.put(100, "SuryaPraksh");
		System.out.println("Updating an element by Key"+m.put(103, "Akshay"));
		//for reverse order sorted manner
		//m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		//for sorted order
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(104, "Pratik");
		m2.put(105, "Parmanand");
		m2.putAll(m);
		System.out.println(m2);
		System.out.println("Value is:"+m2.get(103));
	}
}
