package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C03_RetainAll {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<Integer>();
        Set<Integer>set2=new HashSet<Integer>();


        set1.add(10);
        set1.add(20);

        set2.addAll(set1);
        set2.add(10);
        set2.add(20);

        System.out.println(set1);
        System.out.println(set2);

        System.out.println(set2.retainAll(set1));

        System.out.println(set1);
        System.out.println(set2);
    }
}
