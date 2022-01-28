import java.util.Scanner;
import java.util.Locale;

public class area_of_a_circle {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            double r = scanner.nextDouble(), m = scanner.nextDouble(), c = scanner.nextDouble();
            
            if(!(r == 0 && m == 0 && c == 0)){
                double circle = Math.pow(r,2)*Math.PI, square = Math.pow(r*2,2)*(c/m);
                System.out.println(circle + " " + square);
                continue;
            }

            break;
        }
        
        scanner.close();
    }
}