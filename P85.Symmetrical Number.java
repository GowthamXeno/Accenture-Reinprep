// 5 = 1 0 1 = 1 1 1 = len(3) = 2^3 = 8-1 = 7;
// 9 = 1 0 0 1 = 1 1 1 1 = len(4) = 2^4 = 16-1 = 15;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int BinaryLength = findLength(n);
        System.out.println((int)Math.pow(2,BinaryLength)-1);
        
    }
    public static int findLength(int n){
        int count = 0 ;
        while(n>0){
            count++;
            n = n>>1;
        }
        return count;
    }
}
