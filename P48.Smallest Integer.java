import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int min = Math.min(s.nextInt(),Math.min(s.nextInt(),s.nextInt()));
        System.out.println("Smallest number is "+min);
    }
}
//testcase passed : 3/5
