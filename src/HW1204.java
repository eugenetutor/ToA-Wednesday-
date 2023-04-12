public class HW1204 {
    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];

        // Populate the array with random numbers
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * n);
        }

        long startTime = System.currentTimeMillis();
        int sum = 0;

        // Calculate the sum of the array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}