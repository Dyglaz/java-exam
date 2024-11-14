package rarest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BiletRarest {
    public static int rarest(Map<String, Integer> map) throws Throwable {
        if (map.isEmpty()){
            throw new Exception("Exception: Map is empty!");
        }
        int minEntries = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        int n;
        for (var i : map.entrySet()) {
            n = 0;
            for (var j : map.entrySet()) {
                if (Objects.equals(i.getValue(), j.getValue())) {
                    n++;
                }
            }
            if (n < minEntries) { // можно дописать проверку дополнительную (вернуть меньшее целочисленное при одинаковых значениях)
                minEntries = n;
                minValue = i.getValue();
            }
        }
        return minValue;
    }

    public static void main(String[] args) throws Throwable {
        Map<String, Integer> map = new HashMap<>();
        map.put("ab", 1);
        map.put("ac", 2);
        map.put("ad", 1);
        map.put("ae", 3);
        map.put("af", 1);
        map.put("ag", 3);
        System.out.println(rarest(map));
    }
}
