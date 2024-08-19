import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String ans = "";
        while(num>0){
            int rem = num%10;
            ans = rem*rem+ans;
            num/=10;
        }
        System.out.println(ans);
    }
}
