import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;

public class hoest_problem_q {
    private static void buns_rate(int n, int l, int[] r){
        BigInteger[] buns = new BigInteger[l+1];
        Arrays.fill(buns, BigInteger.ZERO);
        buns[0] = BigInteger.ONE;
        
        for(int i = 0; i < n; i++){
            BigInteger new_buns = BigInteger.ZERO;
            System.out.println(Arrays.stream(buns).reduce(BigInteger::add).get());
            
            for(int j = (l-1); j >= 0; j--){
                buns[j+1] = buns[j];
                new_buns = new_buns.add(buns[j+1].multiply(BigInteger.valueOf(r[j+1])));
            }
            
            buns[0] = new_buns;
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //long time = System.nanoTime();
        
        while(scanner.hasNext()){
            int n = scanner.nextInt(), l = scanner.nextInt(); scanner.nextLine();
            int[] r = new int[l+1];
            
            for(int i = 1; i < (l+1); i++){
                r[i] = scanner.nextInt();
            }
            
            buns_rate(n,l,r);
        }
        
        //System.out.println((double)(System.nanoTime() - time)/1000000000);
    }
}