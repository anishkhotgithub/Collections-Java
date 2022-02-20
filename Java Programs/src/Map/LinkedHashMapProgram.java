package Map;
import java.util.*;

public class LinkedHashMapProgram
{
    public static void main(String[] args) 
    {
         LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
         lhm.put(1001, "Anish");
         lhm.put(1002, "Pratik");
         lhm.put(1003, "Parmand");
         System.out.println(lhm);
         lhm.remove(1003);
         for(Map.Entry m:lhm.entrySet())
         {
        	 System.out.println(m.getKey()+" "+m.getValue());
         }
    }
   
}
