package vn.devmaster.lab01.pkg_collection_api_enhancements;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java Spring");
        map.put(2, "Javascript");
        map.put(3, "PHP Laravel");
        map.put(4, "C# NetCore");

        map.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
