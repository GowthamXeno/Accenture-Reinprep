import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
            int scannedInt = 0;
        for(int i = 0 ; i < n ; i ++){
            scannedInt = scan.nextInt();
            if(scannedInt>0)
                list.add(scannedInt);
        }
        int index = list.size()%2 == 0 ? list.size()/2-1 : list.size()/2;
        System.out.println(list.get(index));
    }
}
