import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The HCF of "+a+" and "+b+" is: "+HCF(a,b));
    }
    public static int HCF(int a,int b){
        if(b==0)
            return a;
        return HCF(b,a%b);
    }
}
//testcase passed : 1/5 (if anyone got testcase passes msg me)
