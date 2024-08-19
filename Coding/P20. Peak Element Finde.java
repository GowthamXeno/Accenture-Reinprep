import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        for(int i = 0 ; i < n ; i ++){
            //Trailing elements
            if(i == 0 && arr[i]>arr[i+1]){
                System.out.println(i);
                return;
            }else if(i == n-1 && arr[i]>arr[i-1]){
                System.out.println(i);
                return;
            }
            //Inner elements except Extreme
            else if( i > 0 && i < n-1 &&arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                System.out.println(i);
                return;
            }
        }
        
    }
}
