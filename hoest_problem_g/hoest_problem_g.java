import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class hoest_problem_g {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n = scanner.nextInt(), area_ltr = 0, area_rtl = 0;
            int[] x = new int[n+1], y = new int[n+1];
            
            x[0] = x[n] = scanner.nextInt();
            y[0] = y[n] = scanner.nextInt();
            
            for(int i = 0; i < n; i++){
                if(i < (n-1)){
                    x[i+1] = scanner.nextInt();
                    y[i+1] = scanner.nextInt();    
                }
                
                area_ltr += x[i] * y[i+1];
                area_rtl += y[i] * x[i+1];
            }
            
            System.out.println(0.5 * (area_ltr - area_rtl));
        }
    }
}