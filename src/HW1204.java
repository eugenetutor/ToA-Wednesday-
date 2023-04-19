public class HW1204 {
    public static void main(String[] args) {
        int n = 10; //O(1)
        int[] arr = new int[n];//O(1)

        // Populate the array with random numbers
        //O(n)
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n);
        }

        long startTime = System.currentTimeMillis();//O(1)
        int sum = 0;//O(1)

        // Calculate the sum of the array
        //O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; i++) {
                sum += arr[i];
            }
        }

        long endTime = System.currentTimeMillis();//O(1)

        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");//O(1)
        //O(1)+O(1)+O(n)+O(1)+O(1)+O(n)+O(1)+O(1) = O(n)+O(n) = O(2n) = O(n)
    }
}