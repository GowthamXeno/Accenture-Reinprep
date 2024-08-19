import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)
            arr[i] = Character.getNumericValue(s.charAt(i));
        
        for(int index = n/2 ; index >= 2 ; index--){
            for(int j = 0 ; j < n-index*2+1 ; j ++){
                if(Arrays.stream(arr,j,j+index).sum() == Arrays.stream(arr,j+index,j+index*2).sum()){
                    System.out.println(index*2);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
