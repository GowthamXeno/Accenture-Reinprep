import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String[] score = new String[n*2];
        int Awin = 0;
        String temp = "";
        int j = 0;
        for(int i = 0 ; i < s.length() ; i ++){
            temp += s.charAt(i);
            if((temp.equals("snake") || temp.equals("water") || temp.equals("gun"))){
                score[j++] = temp;
                temp="";
            }
        }
        for(int i = 0 ; i < n*2-1 ; i += 2){
            String A = score[i];
            String B = score[i+1];
            if((B.equals("water") && A.equals("snake")) ||
                (B.equals("gun") && A.equals("water"))  ||
                (B.equals("snake") && A.equals("gun"))){
                Awin++;
            }
        }
        System.out.println(Awin);
        
    }
}
