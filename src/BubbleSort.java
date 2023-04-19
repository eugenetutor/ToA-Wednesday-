public class BubbleSort {
    //driver method
    public static void main(String[] args) {
        int[] arr = {9,3,2,4,7,2,6,65,1,22};
        int[] result =  bubbleSort(arr);
        output(result);
    }

    //bubble sort
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


    //output method
    static void output(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
