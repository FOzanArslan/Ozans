public class FiveRec {
    public static void main(String[] args){
        FR(16);
    }
    public static void FR(int n){
        if (n< 0){
            System.out.print(n+" ");
        }else {
            System.out.print(n+" ");
            FR(n-5);
            System.out.print(n+" ");
        }

        }
}
