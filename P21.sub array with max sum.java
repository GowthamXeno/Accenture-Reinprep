import java.util.*;
class Main{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = scan.nextInt();
        }
        int MaxSum = Integer.MIN_VALUE; //Because for is array full of nagative number it can be negative also
        int currentSum = 0;
        for(int i = 0 ; i < n ; i ++){
            currentSum = Math.max(currentSum+arr[i],arr[i]);
            MaxSum = Math.max(MaxSum,currentSum);
        }
        System.out.println(MaxSum);
    }
}
