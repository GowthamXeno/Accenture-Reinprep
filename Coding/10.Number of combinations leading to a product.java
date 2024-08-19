import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        int num = scan.nextInt();
        Arrays.sort(arr);
        int count = 0 ;
        
        for(int i = 0 ; i < n-2 ; i ++){
            int j = i+1 , k = n-1 ;
            while(j<k){
                int product = arr[i]*arr[j]*arr[k];
                if(product > num)
                    k--;
                else if(product < num)
                    j++;
                else if(product == num){
                    count++;
                    k--;
                    j++;
                }
            }
        }
        System.out.println(count);
        
    }
}
