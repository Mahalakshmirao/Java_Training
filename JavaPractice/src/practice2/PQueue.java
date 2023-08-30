package practice2;
import java.util.*;

public class PQueue {
    public static void main(String[] args) {

        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("vijay");
        queue.add("karan");
        queue.add("jai");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue);


    }
}
