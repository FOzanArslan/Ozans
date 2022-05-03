public class ArraySum {
    public static void main(String[] args){
        int[] ar= {1,2,3,4,5,6};
        System.out.println(arraysum(ar));
    }
    public static double arraysum(int[] arr){
        double sum = 0;
        for (int i =0; i<arr.length; i++){

            sum += 1.0 / arr[i] ;
        }
        return sum;
    }

}
