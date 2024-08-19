import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int Z = scan.nextInt();
        int sum = Integer.MIN_VALUE;
        sum = Math.max(X+Y,X+Z);
        sum = Math.max(sum,Y+Z);
        System.out.println(sum);
        }
}
