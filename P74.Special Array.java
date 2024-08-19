import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
            
        for(int i = 0 ; i < n-1 ; i ++){
            if(isEven(arr[i]) == isEven(arr[i+1])){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
    public static boolean isEven(int n){
        return n%2 == 0;
    }
}
