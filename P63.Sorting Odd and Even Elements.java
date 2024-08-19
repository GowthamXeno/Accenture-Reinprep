import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        int first = 0, last = 0;
        for(int i =  0 ; i < n ; i ++){
            if(arr[i]%2==0){
                list.add(first,arr[i]); 
                first ++;
                last ++;
            }
            else{
                list.add(last,arr[i]); 
                last++;
            }
        }
        System.out.println(list);
    }
}
