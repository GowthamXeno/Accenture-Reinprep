import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();

        int index = 0;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i]!=0)
                arr[index++] = arr[i];
        }
        
        while(index<n)
            arr[index++] = 0 ;
            
        for(int i = 0 ; i < n ; i ++)
            System.out.print(arr[i] + " ");
    }
}
//testcase passed : 4/5 (might be a bug or msg me if u got)
