//програма для знаходження максимального добутку підмасиву масиву.

public class FirstLesson {
    public static void main(String[] args){
        int[] arr = {3,5,0,-6,7,4};
        int result = maxSubarrayProduct(arr);
        System.out.println("результат"+result);
    }

    public static int maxSubarrayProduct(int[] arr){
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int currentProduct = 1;
            for(int j = i; j<arr.length; j++){
                currentProduct *= arr[j];
                System.out.println("прогон: "+arr[j]+" "+currentProduct);
                if(currentProduct>maxProduct){
                    maxProduct = currentProduct;
                }
            }
            System.out.println("-------");
        }
        return maxProduct;
    }
}
