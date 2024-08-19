import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = scan.nextInt();
        }
        boolean flag = true;
        int ans = 0;
        for(int i = 0 ; i < n ; i ++){
            if(Arrays.stream(arr,0,i).sum() == Arrays.stream(arr,i+1,n).sum()){
               flag = false;
               ans = i+1;
               break;
            }
        }
        if(flag || n<2)
        System.out.println("NOT FOUND");
        else
        System.out.println(ans);
    }
    
}
