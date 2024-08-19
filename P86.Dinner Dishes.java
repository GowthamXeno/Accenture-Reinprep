import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        Arrays.sort(arr);
        if(n>1)
            System.out.println(arr[n-1]+arr[n-2]);
        else
            System.out.println(0);
        
    }
}
