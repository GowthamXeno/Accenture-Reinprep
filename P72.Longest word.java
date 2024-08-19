import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        String longestWord = "";
        int wordlen = 0;
        for(String word : words){
            if(wordlen < word.length()){
                longestWord = word;
                wordlen = word.length();
            }
        }
        System.out.println("The longest string is: "+longestWord);
    }
}
