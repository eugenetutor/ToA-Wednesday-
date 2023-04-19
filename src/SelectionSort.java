public class SelectionSort {
    //driver method
    public static void main(String[] args) {
        int[] arr = {9,3,2,4,7,2,6,65,1,22};
        int[] result =  selectionSort(arr);
        output(result);
    }
    static int[] selectionSort(int[] arr){
        int size = arr.length;
        for(int step = 0; step < size-1; step++){
            int min = step;
            for(int i = step+1; i<size; i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }

            int temp = arr[step];
            arr[step] = arr[min];
            arr[min] =temp;
        }

        return arr;
    }


    static void output(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
