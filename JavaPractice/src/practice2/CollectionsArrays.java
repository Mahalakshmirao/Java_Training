package practice2;
import java.util.*;


public class CollectionsArrays {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        ArrayList<Integer> al2=new ArrayList<Integer>();
        al2.add(50);
        al2.add(100);
        al2.add(150);
        al.addAll(al2);
        al.set(5,60);
        System.out.println(al);
        System.out.println(al.contains(10));
        System.out.println(al.isEmpty());
        System.out.println(al.get(2));
        System.out.println(al.size());
        System.out.println(al.indexOf(100));
        al.remove(3);
        System.out.println(al);
        al.clear();
        System.out.println(al);








        }
    }

