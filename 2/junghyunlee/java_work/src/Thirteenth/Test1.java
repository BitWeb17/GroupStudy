package Thirteenth;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        s2.add("A");
        s2.add("B");
        s2.add("C");

        Set<String> union = new HashSet<String>(s2);
    }
}
