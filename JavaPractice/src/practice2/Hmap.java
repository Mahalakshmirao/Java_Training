package practice2;
import java.util.*;
public class Hmap {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"amit");
        map.put(2,"mahi");
        map.put(3,"vamshi");

        Set<Integer> keys= map.keySet();
        for(Integer key:keys){
            System.out.println(key);
        }
        Collection<String> values =map.values();
        for(String value:values){
            System.out.println(value);
        }

    }
}
