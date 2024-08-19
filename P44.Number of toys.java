import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int totaltoys = scan.nextInt();
        int donatedtoys = scan.nextInt();
        int remainingtoys = totaltoys-donatedtoys; 
        System.out.println("The remaining number of toys = "+remainingtoys);
    }
}
