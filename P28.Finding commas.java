import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int totalCommas = 0;
        int length = Integer.toString(n).length();
        for(int i = 4 ; i <= length ; i ++){            // 1001
            int commas = (i-1)/3;                       // 1
            int start = (int)Math.pow(10,i-1);          // 1000
            int end = (int)Math.min(n,Math.pow(10,i)-1);// 1001 || 9999
            
            totalCommas += commas * (end-start+1);      // 1 * (1001-1000+1) = 2
        }
        System.out.println(totalCommas);
    }
}
