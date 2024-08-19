import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int max = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
           max = Math.max(max,entry.getValue());
        }
        System.out.println(str.length() - max);
       
    }
}
