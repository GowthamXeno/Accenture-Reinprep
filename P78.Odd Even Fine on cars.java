import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int date = scan.nextInt();
        int n = scan.nextInt();
        if(n==0){
            System.out.println(-1);
            return;
        }
        int odd = 0 ;
        int even = 0 ;
        int temp  = 0;
        for(int i = 0 ; i < n ; i ++){
            if(scan.nextInt()%2 == 0)
                even++;
            else
                odd++;
        }        
        
        System.out.println(date%2 == 0 ? 250*odd : 250*even);
    }
}
