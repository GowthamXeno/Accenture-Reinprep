import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean prime = true;
        while(prime)
            prime = !IsPrime(++n);
        System.out.println(n);
    }
    public static boolean IsPrime(int val){
        if(val == 1 || val == 2 || val == 0)
            return true;
        for(int i = 2 ; i <= Math.sqrt(val) ; i ++){
            if(val%i == 0){
                return false;
            }
        }
      return true;
    }
}
