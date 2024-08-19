import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        String s = scan.next();
        for (int i = 0; i < n; i++)
            arr[i] = s.charAt(i) -'0';
        int k = scan.nextInt();
        int zeros = 0, ones = 0, left = 0;
        int result = 0;
        for (int right = 0; right < n; right++) {
            if (arr[right] == 0)
                zeros++; 
            else
                ones++; 
            while (zeros > k || ones > k) {
                if (arr[left] == 0)
                    zeros--;
                else
                    ones--;
                left++;
            }
            result += right - left + 1;
        }
        System.out.println(result);
    }
}
