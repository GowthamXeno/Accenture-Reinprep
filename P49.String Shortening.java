import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = str;
        boolean flag = true;
        while(result.length()>0 && flag){
            flag = false;
            for(int i = 0 ; i < result.length()-1 ; i ++ ){
                if(result.charAt(i)==result.charAt(i+1)){
                    result = result.substring(0,i)+result.substring(i+2,result.length());
                    flag = true;
                    break;
                }
            }
        }
         System.out.println(result.length()>0 ? result : "Empty String");
    }
}
