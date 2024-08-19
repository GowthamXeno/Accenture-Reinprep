import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        double BMI = weight/Math.pow(height,2);
        
        int output = 0;
        if(BMI<18)
            output = 0;
        if(18<=BMI && BMI<25)
            output = 1;
        else if(25<=BMI && BMI<30)
            output = 2;
        else if(30<=BMI && BMI<40)
            output = 3;
        else if(BMI>=40)
            output = 4;
        System.out.println(output);
    }
}
