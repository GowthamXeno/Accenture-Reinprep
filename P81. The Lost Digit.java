import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n-1];
        for(int i = 0 ; i < n-1 ; i ++)
            arr[i] = scan.nextInt();
        Arrays.sort(arr);
        for(int i = 1 ; i < n ; i ++){
            if(i != arr[i-1]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(n);
    }
}
