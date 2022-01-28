import java.util.Scanner;
import java.lang.Math;

public class forskel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n1, n2;
        
        while(scanner.hasNextLong()){
            if((n1 = scanner.nextLong()) >= 0 && (n2 = scanner.nextLong()) >= 0){
                System.out.println(Math.abs(n1 - n2)); 
            }
        }
    }
}
