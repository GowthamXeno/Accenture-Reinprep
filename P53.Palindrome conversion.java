import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = Reverse(n);
        while(n!=result){
            n+=result;
            result = Reverse(n);
        }
        System.out.println(result);
    }
    public static int Reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
}
//testcase passed : 4/5
