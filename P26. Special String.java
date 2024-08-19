import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         String s1 = scan.next();
         String s2 = scan.next();
         int totalCost = 0 ;
         for(char c : s1.toCharArray()){
         int distance = 123 ; //z = 122 to max
             if(!s2.contains(String.valueOf(c))){
                 for(char s : s2.toCharArray()){
                     distance = Math.min(distance,Math.abs(c-s));
                 }
                 totalCost+=distance;
             }
         }
         System.out.println(totalCost);
    }
}
