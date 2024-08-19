import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        int n = number.length();
        int count = 0 ;
        for(int i = 0 ; i < n ; i ++){
           if(i < n-1 && number.charAt(i) == '0' && number.charAt(i+1) == '0'){
               count++;
               i++;
           }else{
               count++;
           }
        }
        System.out.println(count);
    }
}
