package practice2;

import java.sql.SQLOutput;
import java.util.*;

public class Hashset {
    public static void main(String[] args){
        Set <String> set=new HashSet();
    set.add("one");
    set.add("two");
    set.add("three");
    set.add("four");
    set.add("one");

    HashSet<String> set1=new HashSet<>();
    set1.add("ravi");
    set1.add("satya");
    set1.add("sandy");
    set1.add("sandy");

    set.addAll(set1);
        System.out.println(set);


        set.removeIf(str->str.contains("sandy"));
        System.out.println(set);
        set.clear();
        System.out.println(set);

}
}

