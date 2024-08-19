import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        //LOL we dont even need to consider the Array 
        for(int i = 0 ; i < n ; i ++)
                scan.nextInt();
                
        // Total no of rooms - No of Reserved Rooms
        System.out.println(scan.nextInt()-n);
    }
}
