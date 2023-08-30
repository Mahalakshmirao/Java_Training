package practice2;
import java.util.*;


public class StackCF {
    public static void main(String[] args){
        Stack<String> s=new Stack<>();
        s.push("one");
        s.push("two");
        s.push("three");
        s.push("four");
        System.out.println(s.pop());
        System.out.println(s.search("one"));
        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println(s);
    }
}
