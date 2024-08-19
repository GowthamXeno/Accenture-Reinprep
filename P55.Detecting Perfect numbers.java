import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(divisors(n));
    }
    public static int divisors(int n){
        int sum = 0;
        for(int i = 1 ; i < n ; i ++){
            if(n%i == 0)
                sum+=i;
        }
        return sum == n ? 1 : sum ;
    }
}
