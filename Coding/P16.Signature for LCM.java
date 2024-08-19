import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));

    }
    public static int GCD(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int LCM(int a,int b){
        return (a*b)/GCD(a,b);
    }
}
