public class BubbleSort {
    //driver method
    public static void main(String[] args) {
        int[] arr = {9,3,2,4,7,2,6,65,1,22};
        String[] arrayList = {"Swen", "Yaroslav", "Ann", "Oleg","Bogdan"};


        int[] result =  bubbleSort(arr);
        output(result);

        output(bubbleSort(arrayList));
    }

    //bubble sort for int
    static int[] bubbleSort(int[] arr){
        int size =  arr.length;

        for(int step = 0; step < size-1; step++){
            for(int i = 0; i < size - step - 1; i++ ) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
    //bubble sort for String
    static String[] bubbleSort(String[] arr){
        int size =  arr.length;

        for(int step = 0; step < size-1; step++){
            for(int i = 0; i < size - step - 1; i++ ) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }




    //output method for int
    static void output(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //output method for String
    static void output(String[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
