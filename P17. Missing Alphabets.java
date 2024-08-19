import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Set<Character> alpha = new HashSet<>();
        for(char c = 'a' ; c <= 'z' ; c ++){
            alpha.add(c);
        }
        Set<Character> string = new HashSet<>();
        for(char c : str.toCharArray()){
            string.add(c);
        }
        Set<Character> MissingChars = new TreeSet<>(alpha);
        MissingChars.removeAll(string);
        for(char c : MissingChars){
            System.out.print(c);
        }
        System.out.println(); //if the array empty
        
    }
}
