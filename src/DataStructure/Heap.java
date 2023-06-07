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

    void insert(ArrayList<Integer> ht, int newNum){
        int size = ht.size();
        if(size == 0){
            ht.add(newNum);
        }else{
            ht.add(newNum);
            for (int i = size/2-1; i >= 0 ; i--) {
                heapify(ht, i);
            }
        }
    }

    void deleteNode(ArrayList<Integer> ht, int num){
        int size = ht.size();
        int i;
        for (i = 0; i <size ; i++) {
            if(num == ht.get(i))
                break;
        }
        int temp = ht.get(i);
        ht.set(i, ht.get(size-1));
        ht.set(size-1, temp);

        ht.remove(size-1);
        for (int j = size/2-1; j >= 0 ; j--) {
            heapify(ht, j);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        int size = array.size();
        Heap h = new Heap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);
        h.insert(array, 7);
        h.insert(array, 6);

        System.out.println("Max Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 4);
        System.out.println("After deleting: ");
        h.printArray(array, size);
    }

    private void printArray(ArrayList<Integer> array, int size) {
        for(Integer i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
