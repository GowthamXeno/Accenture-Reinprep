import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < n; i++)
            A.add(scan.nextInt());
        for (int i = 0; i < n - 1; i++)
            B.add(scan.nextInt());
        for (int i = 0; i < n - 2; i++)
            C.add(scan.nextInt());
        int miss1 = findmiss(A,B);
        int miss2 = findmiss(B,C);
        System.out.println(miss1);
        System.out.println(miss2);
    }
    public static int findmiss(ArrayList<Integer> list1 , ArrayList<Integer> list2){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : list2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : list1){
            if(map.containsKey(i)){
                if(map.get(i) == 1){
                    map.remove(i);
                }else{
                    map.put(i,map.get(i)-1);
                }
            }else{
                return i;
            }
        }
        return list1.get(0);
    }
}
