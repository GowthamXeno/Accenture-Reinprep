import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        if(n>1){
            int PrintingTime = (n-1)*10;
            int arrivingTime = (n-1)*x;
            int waitingTime = PrintingTime - arrivingTime;
            System.out.println(Math.max(0,waitingTime));
        }else if(n==1){
            System.out.println(0);
        }
    }
}
