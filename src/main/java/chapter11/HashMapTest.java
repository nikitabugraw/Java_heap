package chapter11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class HashMapTest {



    public static void main(String[] args) {
        Map<String,String> frstMap = new HashMap<String, String>();
        for(int i = 0; i < 10; i++)
            frstMap.put("k"+i,"v"+i);
        for(String key : frstMap.keySet())
            System.out.println(key + key.hashCode());
        System.out.println("---------------------------------------------------");
        Map<String,String> scndMap = new LinkedHashMap<String, String>();
        for (int i=0; i< frstMap.keySet().size();i++)
            scndMap.put("k"+i,"v"+i);
        for(String key : scndMap.keySet())
            System.out.println(key + key.hashCode());

    }
}
