package Lambada_Stack_Vector;

import java.util.ListIterator;
import java.util.Vector;

public class VectorList 
{
    public static void main(String[] args)
    {
        int i;
        Vector v=new Vector();
        System.out.println("Before Adding the elements into the vector Size of the vector is :"+v.size());
        for(i=1;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println("After Adding the elements into the vector Size of the vector is :"+v.size());
        System.out.println(v);
        System.out.println("Value removed through index number"+v.remove(5));
        System.out.println(v);
        System.out.println("Capacity of the Vector: "+v.capacity());
        System.out.println("First Element of Vector "+v.firstElement()+"\nLast Element of Vector "+v.lastElement());
        System.out.println("Vector Elements at index 2 is:"+v.get(2));
        ListIterator ltr=v.listIterator();
        while(ltr.hasNext())
        {
            Integer in=(Integer)ltr.next();
            if(in==2)
            {
                ltr.add("College");
            }
        }
        System.out.println(v);
        v.setSize(11);
        System.out.println(v);
        v.forEach(System.out::println);
        v.setElementAt(15, 10);
        System.out.println("After Setting ats the Value at the index 11"+v);
    }
}
