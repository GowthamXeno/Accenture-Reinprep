import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        Arrays.sort(arr);
        for(int i = 0,index = 1 ; i < n ; i ++, index++){
            if(arr[i]!=index){
                System.out.println(index);
                return;          //terminate if got 
            }
        }
        System.out.println(n+1); //if it is the n+1 number 
    }
}
