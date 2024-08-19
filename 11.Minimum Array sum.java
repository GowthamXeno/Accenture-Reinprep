import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        double avg = (arr[n-1]+arr[n-2])/2.0;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i] < avg)
                arr[i]= 0 ;
        }
        int sum = 0;
        for(int i = n-1 ; i >= 0 ; i --){
            if(arr[i]==0)
                break;
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
