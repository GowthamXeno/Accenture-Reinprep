import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String deskNumber = sc.nextLine().trim();
        String[] seats = sc.nextLine().trim().split(" ");
        int bruceIndex = -1;
        for(int i = 0 ; i < seats.length ; i++)
            if(seats[i].equals(deskNumber)){
                bruceIndex = i;
                break;
            }
        int minDistance = Integer.MAX_VALUE;
        for(int i = 0 ; i < seats.length ; i++){
            if(seats[i].equals("-")){
            minDistance = Math.min(minDistance,Math.abs(bruceIndex-(i-1)));
            minDistance = Math.min(minDistance,Math.abs(bruceIndex-(i+1)));
            }
        }
       System.out.println(minDistance);
    }
}
