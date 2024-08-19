import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toLowerCase();
        List<Character> list = new ArrayList<>();
        String vowels = "aeiou";
        int vowel = 0;
        int con = 0;
        for(int i = 0 ; i < vowels.length() ; i ++)
            list.add(vowels.charAt(i));
        for(int i = 0 ; i < s.length(); i ++){
            if(list.contains(s.charAt(i)))
                vowel++;
            else 
                con++;
        }
        System.out.println("Number of vowels: "+vowel);
        System.out.println("Number of consonants: "+con);
    }
} 
