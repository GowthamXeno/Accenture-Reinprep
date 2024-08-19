//here 1 1 1 1 & 0 0 0 1 = 1 (n&1) is used to extract the last digit 
//1 1 1 1 >> 1  = 1 1 1  it is used to Move one position right

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int i = 0;
        while(n>0){
            sum+= n&1;
            n>>=1;
        }
        System.out.println(sum);
    }
}
