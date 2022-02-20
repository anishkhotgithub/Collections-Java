package Map;
import java.util.*;
//Group of obejcts of key value pair
//Map is not related with the collection
//In Map add() method is not used instead of add() we used put() method
//Map is consider as collection of empty objects
//1) HashMap 2)LinkedHasMap 3)TreeMap 4)Set and HashSet
//In HasMap 
public class HashMapProgram
{
    public static void main(String[] args)
    {
        HashMap hm=new HashMap();
        hm.put(1001, "Anish");
        hm.put(1002, "Priya");
        System.out.println(hm);
        System.out.println(hm.put(1002,"Shubham"));
        System.out.println(hm);
        Set s=hm.keySet();
        System.out.println(s);
        
        Set s1=hm.entrySet();
        System.out.println(s1);
        Iterator itr=s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+ " "+m1.getValue()) ;
            if(m1.getKey().equals(1001))
            {
                m1.setValue("Kakarot");
            }
            System.out.println(hm);
        }
        
    }
}
