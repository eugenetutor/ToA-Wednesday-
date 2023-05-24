package DataStructure;

import java.util.ArrayList;

public class Heap {

    void heapify(ArrayList<Integer> ht, int n){
        int size = ht.size();
        int largest = n;
        int l = 2 * n + 1;
        int r = 2 * n + 2;
        if(l<size && ht.get(l)>ht.get(largest))
            largest = l;
        if(r<size && ht.get(r)>ht.get(largest))
            largest = r;

        if(largest != n){
            int temp = ht.get(largest);
            ht.set(largest,ht.get(n));
            ht.set(n,temp);

            heapify(ht, largest);
        }
    }

    public static void main(String[] args) {

    }
}
