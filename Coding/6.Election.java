import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] votes = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i ++){
            votes[i] = scan.nextInt();
            map.put(votes[i],map.getOrDefault(votes[i],0)+1);
        }
        int MaxVal = 0 , Winner = -1;
        boolean isTie = false;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(MaxVal < entry.getValue()){
                MaxVal = entry.getValue();
                Winner = entry.getKey();
                isTie = false;
            }else if(MaxVal == entry.getValue())
                isTie = true;
        }
        if(isTie)
            Winner = -1;
        System.out.println(Winner);
    }
}
