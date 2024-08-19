import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
            map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            for(int i = 0 ; i < entry.getKey() ; i ++)
                list.add(entry.getValue());
        } 
        Collections.sort(list);
        System.out.println(list);
    }
}
