import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r  = scan.nextInt();
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        double maxsteps = 2*r;
        double distance = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        int steps = (int)Math.ceil(distance/maxsteps);
        System.out.println(steps);
    
    }
}
