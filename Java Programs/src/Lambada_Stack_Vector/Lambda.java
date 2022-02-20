package Lambada_Stack_Vector;
//Lambda expression is used to enable functional programming in java
interface Math2
{
	public void display();
}
public class Lambda 
{
	public static void main(String[] args) 
	{
		Math2 m=()->System.out.println("Hello Lambda");
		m.display();
	}
}
