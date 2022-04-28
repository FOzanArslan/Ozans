public class RecursivePrime {
    public static void main(String[] args){
        if (RP(8,2)) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean RP(int n, int i){
        if (n<=2) return (n == 2) ? true: false;
        if (n%i == 0) return false;
        if (i*i > n) return true;

        return RP(n, i+1);
    }
}
