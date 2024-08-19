//Here is the Team name is not mentioned So HashMap Must;
import java.util.*;
class Main{
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            scan.nextLine();
            Map<String,Integer> score = new HashMap<>();
            for(int i = 0 ; i < n ; i ++){
                String scanned = scan.nextLine();
              score.put(scanned,score.getOrDefault(scanned,0)+1);
            }
            String winner = "";
            int MaxScore = 0;
            for(Map.Entry<String,Integer> entry : score.entrySet()){
                if(entry.getValue()>MaxScore){
                    winner = entry.getKey();
                    MaxScore = entry.getValue();
                }
            }
            System.out.println(winner);
    }
}
