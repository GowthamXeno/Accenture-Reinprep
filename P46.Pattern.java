import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0 ; i < N ; i ++){
            for(int j = N ; j > 0 ; j --){
                for(int k = 0 ; k < N-i ; k ++)
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//testcase passed : 1/5 (may be a bug)
