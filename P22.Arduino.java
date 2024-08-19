import java.util.*;
class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    List<Integer> arr = new ArrayList<>();
    while(scan.hasNext())
        arr.add(scan.nextInt());
    int sum = 0;
    int maxDistance = 0;
    for(Integer unit : arr){
        sum+=unit;
        maxDistance = Math.max(Math.abs(sum),maxDistance);
    }    
    System.out.println(maxDistance);
    }
}
