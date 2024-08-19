import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        
        for(char c : s1.toCharArray())
            list1.add(c);
            
        for(char c : s2.toCharArray()){
            while(list1.contains(c))
                list1.remove(Character.valueOf(c));
        }
        if(list1.size()==0){
            System.out.println("Empty");
            return;
        }
        for(char c : list1)
            System.out.print(c);
            
    }
}
