import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(scan.hasNext())
            list.add(scan.nextInt());
        int n = list.size()-1;
        int target = list.get(n);
        list.remove(n);
        int left = 0;
        int right = n-1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n-1 ; i ++)
            for(int j = i+1 ; j < n ; j ++ ){
                int sum = list.get(i)+list.get(j);
                if(sum == target){
                    ans.add(i);
                    ans.add(j);
                    System.out.println(ans);
                    return;
                }
            }
    }
}
