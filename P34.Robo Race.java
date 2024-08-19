import java.util.*;
//Not sure with Answer
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int Y = scan.nextInt();
        int M = scan.nextInt();
            X = X+N;
            Y = Y+M;
        while(X!=Y){
            if(X<Y)
            X = X+N;
            else
            Y = Y+M;
        }
        
        System.out.println(X);
    }
}
//im not sure about the answer testcase passed : 4/5
