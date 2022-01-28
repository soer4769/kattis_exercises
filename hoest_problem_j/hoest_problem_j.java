import java.util.Scanner;
import java.math.BigInteger;

public class hoest_problem_j {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            long n = scanner.nextLong();
            BigInteger f0 = new BigInteger("0"), f1 = new BigInteger("1"), fib;
            System.out.println(f1);
            
            while(n--> 1){
                fib = f0.add(f1);
                f0 = f1;
                f1 = fib;
                
                System.out.println(fib);
            }
        }
    }
}