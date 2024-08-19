import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        while(Y!=0){
            if(X<Y){
                int temp = X;
                X = Y;
                Y = temp;
            }
            int T = X-Y;
            X = Y;
            Y = T;
        }
        
        System.out.println(X);
    }
}
