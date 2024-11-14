package hasOdd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BiletHasOdd {
    public static boolean hasOdd(Set<Integer> set) {
        if (set.isEmpty()) {
            return false;
        }
        for (Integer num : set) {
            if (num % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,4,6));
        System.out.println(hasOdd(set1));
    }
}
