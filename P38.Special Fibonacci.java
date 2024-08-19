import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i <= n ; i ++)
            dp[i] = (dp[i-1]*dp[i-1] + dp[i-2]*dp[i-2]) % 47;
        System.out.println(dp[n]);
       //[1,1,2,5,29] // for input = 4;
       // output = 29
    }
}
