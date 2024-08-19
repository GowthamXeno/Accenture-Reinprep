import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        int MaxScore = 0;
        for(int i = 0 ; i < n-k+1; i ++){
        int Currentscore = 0;
        int index = 1;
            for(int j = i ; j < i+k ; j ++){
                Currentscore += arr[j]*index;
                index++;
            }
            MaxScore = Math.max(MaxScore,Currentscore);
        }
        System.out.println(MaxScore);
    }
}
