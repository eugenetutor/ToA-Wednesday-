public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {9,3,2,4,7,2,6,65,1,22};
        int[] result =  countingSort(arr);
        output(result);
    }

    private static int[] countingSort(int[] arr) {
        int size = arr.length;
        int[] output = new int[size+1];

        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];

        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }
        for(int i = 0; i< size; i++){
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i-1];
        }
        for (int i = size - 1; i >=0; i--) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < size; i++) {
            arr[i] = output[i];
        }

        return arr;
    }

    static void output(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
