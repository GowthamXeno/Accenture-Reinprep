import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String grades = scan.next();
        int p = scan.nextInt();
        int k = scan.nextInt();
        Set<Character> possibleGrade = new TreeSet<>();
        possibleGrade.add(grades.charAt(p-1));
        int index = 1;
        for(int i = 1 ; i <= k ; i ++ ){
            if(p+i-1 < grades.length())
                possibleGrade.add(grades.charAt(p+i-1));
            if(p-i-1 >= 0)
                possibleGrade.add(grades.charAt(p-i-1));
        }
        for(char c: possibleGrade){
            System.out.println(c);
            return;
        }
    }
}
