public class QuickSort {
    //driver method
    public static void main(String[] args) {
        int[] arr = {9,3,2,4,7,2,6,65,1,22};
        int[] result =  quickSort(arr, 0, arr.length-1);
        output(result);
    }

    private static int[] quickSort(int[] arr, int start, int end) {
        if(start < end){
            int pivot  = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot+1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int i = (start-1);

        for (int j = start; j < end; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return (i+1);
    }

    static void output(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
