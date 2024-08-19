import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] hours = new int[n];
        for(int i = 0 ; i < n ; i ++)
            hours[i] = scan.nextInt();
            
        int totalMin = 0;
        
        for(int i = 0 ; i < n ; i ++)
            totalMin += hours[i]*60;
        
        System.out.println(totalMin/10);
        
    }
}
