import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] jar = new int[n];
        int A = 0 ;
        for(int i = 0 ; i < n ; i ++){
            jar[i] = scan.nextInt();
        }
        for(int i = 0 ; i < n ; i ++){
            A+= jar[i]/3;
            if(jar[i] % 3 != 0){
                A+=1;
            }
        }
        
        System.out.println(A);
    }
}
