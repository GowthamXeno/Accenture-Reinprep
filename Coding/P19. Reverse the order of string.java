import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(" ");
        String ans = "";
        for(String s : words){
            ans = s +" " + ans;
        }
        System.out.println(ans);
    }
}
