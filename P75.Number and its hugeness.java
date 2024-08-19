//if suppose if the array is [1,3,33,3,7,7,7,....] arr[0] = 1 is defualt
//if suppose i want to fill arr[2] = arr[i-1] | i+1 = arr[1] | 2 = 3 | 3 = 011 | 011 = 011 = 3 
//(Assume 1 bases indexing bro) 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        for(int i = 1 ; i < n ; i ++){
            arr[i] = i+1 | arr[i-1];
        }
        Arrays.sort(arr);
        for(int i = n-1 ; i >= 0 ; i --){
            if(isPrime(arr[i])){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
        
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2 ; i <= Math.sqrt(n) ; i ++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
} 
