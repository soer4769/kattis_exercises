import java.util.Scanner;
import java.util.Locale;

public class grass_seed_inc {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        float seed_cost = scanner.nextFloat(), cost = 0;
        int lawns = scanner.nextInt();
        
        while(lawns--> 0){
            cost += scanner.nextFloat() * scanner.nextFloat();
        }
        
        System.out.println(cost * seed_cost);
        scanner.close();
    }
}