package DataStructure;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

        ht.put(123,432);
        ht.put(12,124);
        ht.put(1,155);
        ht.put(156,24);
        ht.put(21,132);
        ht.put(233,766);

        ht.remove(1);
        System.out.println(ht);
    }
}
