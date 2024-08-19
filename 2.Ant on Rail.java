import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        
        int sum = 0;
        int count = 0 ;
        for(int i = 0 ; i < n ; i ++){
            sum+=arr[i];
            if(sum==0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
