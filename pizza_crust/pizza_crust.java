import java.util.Scanner;
import java.lang.Math;

public class pizza_crust {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            float r = scanner.nextInt(), c = scanner.nextInt();
            System.out.println((Math.PI * Math.pow(r - c,2)) / (Math.PI * Math.pow(r,2)) * 100);    
        }
    }
}
