import java.util.Scanner;
import java.math.BigInteger;

public class a_different_problem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String[] intLine = scanner.nextLine().split(" ");
            BigInteger A = new BigInteger(intLine[0]);
            BigInteger B = new BigInteger(intLine[1]);
            BigInteger C = A.subtract(B).abs();
            System.out.println(C);
        }
    }
}
