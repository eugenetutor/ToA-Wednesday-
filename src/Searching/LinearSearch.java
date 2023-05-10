package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {1,24,346,14,62,6,45};
        System.out.println(linearSearch(num, 346));
    }

    private static int linearSearch(int[] num, int numberToFind) {
        for(int i = 0; i < num.length; i++) {
            if(num[i] == numberToFind){
                return i;
            }
        }
        return -1;
    }
}
