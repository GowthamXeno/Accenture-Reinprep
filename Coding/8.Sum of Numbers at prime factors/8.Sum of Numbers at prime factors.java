import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 0){
            System.out.println(-1);
            return;
        }
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scan.nextInt();
        List<Integer> primeFactor = new ArrayList<>();
        int num = scan.nextInt();
            for(int i = 2 ; i <= num ; i++){
            while(num%i==0){
                primeFactor.add(i);
                num/=i;
            }
            }
            if(num>2)
                primeFactor.add(num);
            int sum = 0 ;
            for(int i = 0 ; i < primeFactor.size() ; i ++){
                if(primeFactor.get(i) > n){
                    sum = 0;
                    break;
                }
                sum+= arr[primeFactor.get(i)];
            }
        System.out.println(sum);
    }
}
