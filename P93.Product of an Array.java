import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n==0){
            System.out.println(1);
            return;
        }
        long product = scan.nextLong();
        for(int i = 1 ; i < n ; i ++){
            long num = scan.nextLong();
            product  = (Long)(product * num);
        }
        System.out.println(product);
    }
}
