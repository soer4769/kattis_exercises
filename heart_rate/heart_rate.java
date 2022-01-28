import java.util.Scanner;
import java.util.Locale;

public class heart_rate {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double n = scanner.nextDouble(), b, p, bpm, min_abpm, max_abpm;
        
        for(int i = 0; i < n; i++){
            b = scanner.nextDouble();
            p = scanner.nextDouble();
            bpm = (60*b)/p;
            min_abpm = bpm - (bpm/b);
            max_abpm = bpm + (bpm/b);
            
            System.out.println(min_abpm + " " + bpm + " " + max_abpm);
        }
        
        scanner.close();
    }
}