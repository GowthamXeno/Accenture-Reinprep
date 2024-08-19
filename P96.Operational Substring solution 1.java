import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int start = 0;
        int end = 0;
        int count = 0;
        while(start < s.length()){
            while(end < s.length() && arr[start] == arr[end]){
                count += end-start+1;
                end++;
            }
            start = end;
        }
        System.out.println(count);
    }
}
