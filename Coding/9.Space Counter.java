import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0 ;
        for(int i = 0 ; i < str.length(); i ++){
            if(str.charAt(i) == ' ')
                count++;
        }
        
        System.out.println(count);
    }
}
