//Method 2 : (Traditional i think so)
//formula for finding how many substring of length f
// total length = f*(f+1)/2
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        int count = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int f = entry.getValue();
            count += f*(f+1)/2;
        }
        System.out.println(count);
    }
}
