import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        while (scan.hasNextInt()) {
            input.add(scan.nextInt());
        }
        int size = input.size() / 2;
        int[] arr1 = new int[size];
        int[] arr2 = new int[input.size() - size];
        Set<Integer> unionSet = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            arr1[i] = input.get(i);
            unionSet.add(arr1[i]);
        }
        for (int i = size; i < input.size(); i++) {
            arr2[i - size] = input.get(i);
            unionSet.add(arr2[i - size]);
        }
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        
        List<Integer> intersection = new ArrayList<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
                set1.remove(num); 
            }
        }
        
        System.out.println(intersection);
        System.out.println(unionSet);
        
        scan.close();
    }
    
}
//testcase passed : 4/5
