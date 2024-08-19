import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int index = -1;
        for(int i  = s.length()-1 ; i >= 0 ; i -- )
            if(s.charAt(i) == '1'){
                index = i;
                break;
            }
        System.out.println(index);
    }
}
