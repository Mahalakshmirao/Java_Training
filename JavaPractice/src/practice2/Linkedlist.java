package practice2;
import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(2);
        ll.add(2);
        ll.add(3);
        ll.add(5);
        LinkedList<Integer> ll2=new LinkedList<>();
        ll2.add(10);
        ll2.add(15);
        ll.addAll(ll2);


        HashSet<Integer> uniqueElelments=new HashSet<>();

        Iterator<Integer> iterator= ll.iterator();

        while(iterator.hasNext()){
            Integer element=iterator.next();

            if(!uniqueElelments.contains(element)){
                uniqueElelments.add(element);

            }
            else{
                iterator.remove();
            }
        }
        for(Integer element:ll){
            System.out.println(element);
        }



    }

}
