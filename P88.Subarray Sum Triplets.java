import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        int count = 0 ;
        for(int i =  0 ; i < n-2 ; i ++){
            if(arr[i]+arr[i+2] == arr[i+1])
                count++;
        }
        System.out.println(count);
    }
}
