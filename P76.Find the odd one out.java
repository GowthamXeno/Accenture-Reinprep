import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] words = new String[n];
        int[][] patterns = new int[n][];//which store pattern of each string n rows
        for(int i = 0 ; i < n ; i ++){
            words[i] = scan.nextLine();
            patterns[i] = GeneratePattern(words[i]);
        }
        
        Map<String,Integer> patternCount = new HashMap<>();
        String[] patternStrings = new String[n]; 
        for(int i = 0 ; i <  n ; i ++){
            patternStrings[i] = Arrays.toString(patterns[i]);
            patternCount.put(patternStrings[i],patternCount.getOrDefault(patternStrings[i],0)+1);
        }
        String OddPattern = "";
        for(int i = 0 ; i < n ; i ++){
            if(patternCount.get(patternStrings[i])==1){
                OddPattern = patternStrings[i];
            }
        }
        for(int i = 0 ; i < n ; i ++){
            if(patternStrings[i].equals(OddPattern)){
                System.out.println(words[i]);
                return;
            }
        }
    }
    public static int[] GeneratePattern(String s){
        int n = s.length();
        int[] pattern = new int[n-1];
        for(int i = 0 ; i < n-1 ; i ++)
            pattern[i] = s.charAt(i+1) - s.charAt(i);
        return pattern;
    }
    
}
