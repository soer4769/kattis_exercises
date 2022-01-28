import java.util.Scanner;
import java.util.Locale;

public class bus {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for(int i = 0; i < n; i++){
            int k = scanner.nextInt();
            double p = 1;
            
            while(k--> 1){
                p += 0.5;
                p *= 2;
            }
            
            System.out.println(Math.round(p));
        }
        
        scanner.close();
    }
}