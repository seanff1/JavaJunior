package section6;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        //1) implement HashMap
        HashMap<Integer,String> hMap = new HashMap<>();
        mapUtil(hMap);
        changeToOrderedMap(hMap);
    }

    //2) Method for adding and printing values to our HashMap
    public static void mapUtil(Map<Integer,String> map)
    {
        //1. Add Key-Value Pairs
        map.put(101, "Steve");
        map.put(502, "Roger");
        map.put(22, "Jennifer");
        map.put(315, "Mika");
        map.put(750, "Kelly");

        //2 Access elements
        System.out.println("See all the keys" + map.keySet());
        System.out.println("See all the Values" + map.values());
        System.out.println("See all key-value pairs: " + map);
        System.out.println("\n");
    }
    //3) Method for creating a TreeMap from our HashMap values to
    //  make the data ordered
    public static void changeToOrderedMap(Map<Integer,String> map)
    {
        TreeMap<Integer,String> aTreeMap = new TreeMap<>(map);
        System.out.println("See all the keys" + aTreeMap.keySet());
        System.out.println("See all the Values" + aTreeMap.values());
        System.out.println("See all key-value pairs: " + aTreeMap);
    }
}
