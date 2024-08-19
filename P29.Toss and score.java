import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int score = 0;
        int consecutiveH = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i)=='H'){
                score+=2;
                consecutiveH++;
            }else{
                score--;
                consecutiveH = 0;
            }
            if(consecutiveH==3)
                break;
        }
        System.out.println(score);
    }
}
