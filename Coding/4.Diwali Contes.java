import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int TravelTime = scan.nextInt();
        int totaltime = 4*60;
        int remtime = totaltime-TravelTime;
        int solvetime = 0;
        int count = 0;
        for(int i = 1 ; i <= N ; i ++){
            solvetime = i*5;
            if(solvetime <= remtime){
                remtime -= solvetime;
                count++;
            }
        }
        System.out.println(count);
    }
}
