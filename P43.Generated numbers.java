import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        Set<Integer> set = new HashSet<>();
        
        if(A == 0 && B == 0){
            set.add(N);
        }else if(A == 0 || B == 0){
            int tempAB = A==0 ? B : A;
            for(int i = 0 ; N-(i*tempAB) > 0 ; i ++){
                set.add(N-(i*tempAB));
            }
        }else{
        for(int i = 0 ; i <= A ; i ++){
            for(int j = 0 ; j <= B ; j ++){
                int left = N - (i*A) - (j*B);
                if(left > 0 )
                    set.add(left);
            }
        }
        }
        System.out.println(set.size());
//         System.out.println(set);
        
    }
}
//testcase passed : 4/5
