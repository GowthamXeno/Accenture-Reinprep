import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        while(n%p != 0){
            p++;
        }
        int sum = 0 ;
        while(p>0){
            sum = sum+(p%10);
            p/=10;
        }
        System.out.println(sum);
}
}
