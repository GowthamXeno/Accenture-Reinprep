import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0 ;
        for(int i = 1 ; i < N ; i ++)
            for(int j = 1 ; j < N ; j ++)
                for(int k = 1 ; k < N ; k ++)
                    count = Satisfy(i,j,k,N) ? count+1 : count;
                
        System.out.println(count);
        
    }
    
    public static boolean Satisfy(int a,int b,int c,int N){
        int cal = a*a+b*b+c*c+a*b+b*c+c*a;
        return cal == N;
    }
}
