import java.util.Scanner;
import java.util.Locale;

public class roaming_romans {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(Math.round(scanner.nextDouble()*1000*5280/4854));
        scanner.close();
    }
}