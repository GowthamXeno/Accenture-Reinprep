import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] fam = new int[N];
        for(int i = 0 ; i < N ; i ++)
            fam[i] = scan.nextInt();
        Map<Integer,Integer> price = new HashMap<>();
        for(int i = 0 ; i < M ; i ++)
            price.put(scan.nextInt(),scan.nextInt());
            
        int[] Maxweight = new int[N];
        for(int i = 0 ; i < N ; i ++){
            int CurWeight = 0;
            for(Map.Entry<Integer,Integer> entry : price.entrySet()){
                if(entry.getKey()<=fam[i])
                    CurWeight+=entry.getValue();
            }
            Maxweight[i] = CurWeight;
        }
        for(int i : Maxweight){
            if(i==0)
            System.out.print(" ");
            else
            System.out.print(i+" ");
        }
    }
}
//testcase passed : 2 / 5 (Bug i think so)
