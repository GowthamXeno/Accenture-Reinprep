import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
            
        int MaxScore = 0;
        
        int i = 0 , j = n-1;
        while(i<j){
            MaxScore += Math.abs(arr[i++]-arr[j--]);
        }
        System.out.println(MaxScore);
    }
}
