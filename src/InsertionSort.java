public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9,3,2,4,7,2,6,65,1,22};
        int[] result =  insertionSort(arr);
        output(result);
    }

    private static int[] insertionSort(int[] arr) {
        int size  = arr.length;

        for (int step = 1; step < size; step++){
            int key = arr[step];
            int j  = step - 1;

            while(j >= 0 && key < arr[j]){
                arr[j+1] =  arr[j];
                --j;
            }
            arr[j+1]  = key;

        }

        return arr;
    }

    static void output(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
