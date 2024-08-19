import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int A = scan.nextInt();
        int LastKid = (K+A-1)%N;
        LastKid  = LastKid == 0 ? N : LastKid;
        System.out.println(LastKid);
    }
}
