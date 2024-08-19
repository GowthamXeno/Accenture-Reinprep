import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int limit = scan.nextInt();
        int sum = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i ++){
            sum += s.charAt(i);
            if(limit<sum)
                break;
            ans.append(s.charAt(i));
        }
        System.out.println(ans.toString());
        
    }
}
