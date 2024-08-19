import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();
        for (int i = 0; i < n; i++)
            A.add(scan.nextInt());
        for (int i = 0; i < n - 1; i++)
            B.add(scan.nextInt());
        for (int i = 0; i < n - 2; i++)
            C.add(scan.nextInt());
        Integer miss1 = null;
        Integer miss2 = null;
        for (int item : A) {
            if (!B.contains(item) && !C.contains(item)) {
                miss1 = item;
            } else if (!C.contains(item)) {
                miss2 = item;
            } else if (miss1 != null && miss2 != null) {
                break;
            }
        }
        System.out.println(miss1);
        System.out.println(miss2);
    }
}
//testcase passed : 3/5
