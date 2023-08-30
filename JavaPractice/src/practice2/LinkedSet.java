package practice2;
import java.util.*;

public class LinkedSet {
    public static void main(String[] args) {
        TreeSet<Integer> Tset=new TreeSet<>();
        Tset.add(56);
        Tset.add(1);
        Tset.add(90);
        Tset.add(55);
        Tset.add(23);
        Tset.add(80);
        System.out.println(Tset);
        System.out.println(Tset.pollFirst());
        System.out.println(Tset.subSet(2,81));
        System.out.println(Tset.isEmpty());
        Tset.clear();
        System.out.println(Tset.isEmpty());


    }
}
