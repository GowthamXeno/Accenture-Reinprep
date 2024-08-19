import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        do{
            n+=1;
        }while(!check(n));
        
        System.out.println(n);
    }
    public static boolean check(int n){
        Set<Integer> set = new HashSet<>();
        while(n>0){
            set.add(n%10);
            n/=10;
        }
        return set.size() == 4;
    }
}
