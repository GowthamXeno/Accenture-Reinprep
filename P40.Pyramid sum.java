import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = n;
        for(int i = 2 ; i <= n  ; i++ ){
            sum += i*(n*2 - (i-1)*2);
        }
        System.out.println(sum);
    }
}
//ip : 5
//here 1 come n time 
//2 come 8 tms which is n*2 - (i-1)*2 = 10 - 2 = 8 
//3 come 6 tms which is n*2 - (i-1)*2 = 10 - 4 = 6 
//4 come 4 tms which is n*2 - (i-1)*2 = 10 - 6 = 4 
//5 come 2 tms which is n*2 - (i-1)*2 = 10 - 8 = 2 
