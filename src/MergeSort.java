public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,3,2,4,7,2,6,65,1,22};
        int[] result =  mergeSort(arr);
        output(result);
    }

    private static int[] mergeSort(int[] arr) {
        int inputLength = arr.length;

        //Divide
        if(inputLength>2){
            int middle = inputLength/2;
            int[] leftHalf = new int[middle];
            int[] rightHalf = new int[inputLength - middle];

            for (int i = 0; i < middle; i++) {
                leftHalf[i]  = arr[i];
            }
            for (int i = middle; i < inputLength; i++) {
                rightHalf[i-middle]  = arr[i];
            }

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            //Merge
            merge(arr, leftHalf, rightHalf);

        }
        return arr;
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while(i<leftSize && j <rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    static void output(int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
