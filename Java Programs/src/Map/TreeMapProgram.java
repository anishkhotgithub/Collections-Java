package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram 
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(1001, "Anish");
        tm.put(1002, "Pratik");
        tm.put(1003, "Naruto");
        System.out.println("Before invoking remove method");
        for(Map.Entry m:tm.entrySet())  
        {  
            System.out.println(m.getKey()+" "+m.getValue());      
        }
        tm.remove(1002);
        System.out.println("After invoking remove method");
        for(Map.Entry m:tm.entrySet())  
        {  
            System.out.println(m.getKey()+" "+m.getValue());      
        }
    }
}
