import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] index = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        for(int i =  0 ; i < n ; i ++)
            index[i] = scan.nextInt();
        
        for(int i =  0 ; i < n ; i ++)
            System.out.print(arr[index[i]]+" ");
        
    }
}
//testcase passed : 1/5
