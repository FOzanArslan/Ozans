public class Recursiveexp {
    public static void main(String[] args){
        System.out.println(rec(4,2));
    }
    public static int rec(int pow , int num){
        int sonuc;
        if (pow < 1) return 1;
        else sonuc =  num * rec(pow-1, num);

        return sonuc;
    }
}
