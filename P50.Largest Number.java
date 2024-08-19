import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int Max = Math.max(s.nextInt(),Math.max(s.nextInt(),s.nextInt()));
        System.out.println("The largest number is: "+Max);
    }
}
