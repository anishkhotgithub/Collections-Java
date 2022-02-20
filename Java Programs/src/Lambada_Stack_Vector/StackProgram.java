package Lambada_Stack_Vector;
import java.util.*;
//stack is child class of vector and its specially design for LIFO(last in First Out)
//Stack operations are:-push(),pop(),peek(),empty(),search()
//Stack s=new Stack()
//Peek elements remove the top of the removal
//search operation give us offset value
//if we are searching for an element not available in the stack then it will returns its offeset value -1
public class StackProgram 
{
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push("Why");
        s.push("Hello");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.search("W"));
        System.out.println(s.search("Hello"));
        System.out.println("Top most element"+s.peek());
        s.pop();
        System.out.println("After Removal"+s);
        
    }
}
