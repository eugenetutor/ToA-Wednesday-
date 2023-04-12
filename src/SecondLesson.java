public class SecondLesson {

    public static void main(String[] args) {
        boolean result = isPrime(100067);
        System.out.println("результат " + result);
    }

//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            System.out.println(i);
//            System.out.println(Math.sqrt(n));
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 2) {
            System.out.println("i="+i);

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}






