import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] arr = s.toCharArray();
        
        String R = s.replace('W','R');
        String B = s.replace('W','B');
        
        int Badness = Math.min(badness(R),badness(B));

        System.out.println(Badness);
    }
    public static int badness(String s){
        int count = 0;
        for(int i = 0 ; i < s.length()-1 ; i ++){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
    
}
