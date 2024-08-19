import java.util.*;
class Main{
    final static long MOD = 1000000007; // Using a constant directly

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //System.out.println(Fellis(n)); // Aproach 1
        System.out.println(felis(n)); // Aproach 2
    }
    //Aproach 1
    public static int Fellis(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + 7 * dp[i - 2] + (i / 4)) % MOD;
        }
        return (int) dp[n];
    }
    //Aproach 2
    public static long felis(int n) {
        long s = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        long first = 1;// n-1
        long second = 1;// n-2
        for (int i = 2; i <= n; i++) {
            s = (long) (((first + 7 * second + (i / 4)) % MOD));
            second = first;
            first = s;
        }
        return s;
    }
}
