import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        int k = scan.nextInt();
        if(str.isEmpty()||n==0){
            System.out.println("NULL");
            return;
        }
        String ans = "";
        k = k%n;
        ans = str.substring(k)+str.substring(0,k);
        System.out.println(ans);
        
    }
}
//testcase passed : 4/5
