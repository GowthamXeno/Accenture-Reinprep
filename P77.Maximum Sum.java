import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        int Maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for(int i = 0 ; i < n ; i ++){
              cursum +=arr[i]; //this is mandatory if all inputs are negative
              Maxsum = Math.max(Maxsum,cursum);
              cursum = Math.max(cursum,0);
        }
        System.out.println(Maxsum);
    }
}
