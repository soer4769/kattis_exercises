import java.util.Scanner;
import java.util.Locale;

public class tais_formula {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        double area = 0, t1 = scanner.nextInt(), v1 = scanner.nextDouble();
        
        for(int i = 1; i < n; i++){
            double t2 = scanner.nextInt(), v2 = scanner.nextDouble();
            area += (v1+v2)/2*(t2-t1)/1000;
            t1 = t2; 
            v1 = v2;
        }
        
        System.out.println(area);
        scanner.close();
    }
}