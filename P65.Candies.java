// we can buy 1,2,3,4 total 4 candies with 10rs;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] prices = new int[n];
        for(int i = 0 ; i < n ; i ++)
            prices[i] = scan.nextInt();
        int budget = scan.nextInt();
        
        Arrays.sort(prices);
        int count = 0 ;
        for(int i =  0 ;i < n ; i ++)
            if(prices[i]<=budget){
                budget-=prices[i];
                count++;
            }
         System.out.println(count);
    }
}
