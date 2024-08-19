import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();
        Map<Character,Integer> ch = new HashMap<>();
        
        String vowel = "aeiou";
        for(int i = 0 ; i < vowel.length() ; i ++){
            ch.put(vowel.charAt(i),0);
        }
        char MaxChar = 'a';
        for(int i = 0 ; i < str.length() ; i ++){
            char currentChar = str.charAt(i);
            if(ch.containsKey(currentChar)){
            ch.put(currentChar,ch.get(currentChar)+1);
            MaxChar = ch.get(currentChar) > ch.get(MaxChar) ? currentChar : MaxChar;
            }
        }
        
        System.out.println(MaxChar);
    }
}
