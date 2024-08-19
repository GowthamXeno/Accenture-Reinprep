import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        Arrays.sort(arr);
        int[] ans = new int[2];
        int i = 0 , j = n-1;
        int maxProduct = Integer.MIN_VALUE;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum<18)
                i++;
            else if(sum > 18)
                j--;
            else if (sum == 18 && arr[i]<arr[j]){
                if(maxProduct < arr[i]*arr[j]){
                    ans[0] = arr[j];
                    ans[1] = arr[i];
                    maxProduct = arr[i++]*arr[j--];
                }
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
