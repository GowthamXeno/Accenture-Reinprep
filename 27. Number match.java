import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = scan.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int A = 0 ,B = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          int element  = entry.getKey();
          int count = entry.getValue();
          if(element % 2 == 0){
              if(count%2==0){
                  A++;
              }else{
                  B++;
              }
          }else{
              if(count%2==0){
                  B++;
              }else{
                  A++;
              }
          }
        }
        
        if(A>B)
            System.out.println("A "+A);
        else if(A<B)
            System.out.println("A "+B);
        else
            System.out.println("T 0");

    }
    public static boolean IsEven(int val){
        return val%2==0;
    }
}
//testcase passed  : 1/5 (Bug in Reinprep I guess)
