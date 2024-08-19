import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
            
        int target = scan.nextInt();
        
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(CountBit(arr[i]) == target)
                count++;
        }
        System.out.println(count);
        
    }
    public static int CountBit(int n){
        int count = 0;
        while(n>0){
            count += n&1;
            n = n>>1;
        }
        return count;
    }
}
