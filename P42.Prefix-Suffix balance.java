import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
            
        int[] result = new int[n];
        
        for(int i = 0 ; i < n ; i ++){
            int leftsum = Arrays.stream(arr,0,i+1).sum();
            int rightsum = Arrays.stream(arr,i+1,n).sum();
            result[i] = Math.abs(leftsum - rightsum);
        }
        System.out.println(Arrays.toString(result));
    }
}
