public class Lesson2 {
    public static void main(String[] args) {
       int[] arr = {0,1,3,23,3,3,4,2,34,45,5};
       test3();
    }

    public static void test(int[] arr) {
        int a = 5;//O(1)
        int x = 5+(15*20);//O(1)
        int y = 15 - 2;//O(1)
        System.out.println(arr[8]);//O(1)
        //total time = O(1)+O(1)+O(1)+O(1) = 4 * O(1) = O(1)
    }

    public static void test2(int[] arr) {
        //liner time
        int x = 5+(15*20); //O(1)
        for(int i = 1; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        //total time = O(arr) * O(1) = O(n)
    }

    public static void test3() {
        //quadratic time
        int n = 10;
        for(int i = 0; i<n; i++){
            System.out.println("---");
            System.out.println(i);
            System.out.println("---");
            for(int j = 0; j<n; j++){
                System.out.println(j);
            }
        }
        //total time = O(n) * O(n) = O(n^2)

//        for(int j = 0; j<n; j++){
//            System.out.println(j);
//        }
//        for(int j = 0; j<a; j++){
//            for(int j = 0; j<n; j++){
////            System.out.println(j);
////        }
//        }
        //total time = O(n) + O(n) = O(2n) = O(n)
        //total time = O(n) + O(a) = O(n+a)
        //total time = O(a) * O(n) = O(a*n)

//        if(x>0){
//            //O(1);
//        }else if(x<0){
//            //O(logN);
//        }else{
//            //O(n^2);
//        }

        //total time = O(n^2)
    }
}

