import java.util.Scanner;
import java.util.Locale;

public class quality_adjusted_life_year {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            double qaly = 0;
            
            for(int i = 0; i < n; i++){
                qaly += scanner.nextDouble() * scanner.nextDouble();
            }
            
            System.out.printf("%.3f",qaly);
        }
    }
}