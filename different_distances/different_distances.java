import java.util.Scanner;
import java.util.Locale;

public class different_distances {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double x1, y1, x2, y2, p, equation;
        
        while((x1 = scanner.nextDouble()) > 0){
            y1 = scanner.nextDouble();
            x2 = scanner.nextDouble();
            y2 = scanner.nextDouble();
            p = scanner.nextDouble();
            
            equation = Math.pow(Math.pow(Math.abs(x1-x2),p)+Math.pow(Math.abs(y1-y2),p), 1/p);
            System.out.printf("%.10f\n", equation);
        }
    }
}