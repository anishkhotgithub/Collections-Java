package Comparable;

import java.util.Comparator;

public class Students implements Comparable 
{
	private String name;
	private int marks;
	public Students(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Object obj)
	{
		Students s=(Students)obj;
		if(this.marks>s.getMarks())
			return 1;
		else if(this.marks<s.getMarks())
			return -1;
		else
			return 0;
	}
	public String toString()
	{
		StringBuffer sb= new StringBuffer();
		sb.append("Name: "+name+"\n");
		sb.append("Marks: "+marks+"\n");
		return sb.toString();
	}
}
