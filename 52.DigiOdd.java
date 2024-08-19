import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int len = String.valueOf(n).length();
        int count = 0;
         for(int i = 1 ; i <= len ; i +=2){
             int start = (int)Math.pow(10,i-1);
             int end = Math.min(n,(int)Math.pow(10,i)-1);
             count += end-start+1;
         }
         System.out.println(count);
    }
}
