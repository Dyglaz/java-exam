package Bilet_2_mapReverse;

import java.util.HashMap;
import java.util.Map;

public class mapReverse {
    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> reversedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"s");
        map1.put(2,"sf");
        map1.put(3,"sggg");
        System.out.println(reverse(map1));
    }
}
