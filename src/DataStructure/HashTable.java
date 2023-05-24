package DataStructure;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

        ht.put("Віктор",432);
        ht.put("Марія",124);
        ht.put("Микола",155);
        ht.put("Олег",24);
        ht.put("Леонід",132);
        ht.put("Василь",766);

        ht.remove("Василь");
        System.out.println(ht);
    }
}
