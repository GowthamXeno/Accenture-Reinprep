import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = 1;
        for(int i = 1 ; i <= n ; i ++){
            for(int j = 0 ; j < i ; j ++)
                System.out.print(num+++" ");
            System.out.println();
        }
    }
}
//testcase passed : 0/5 (if anyone got testcase passes msg me)
