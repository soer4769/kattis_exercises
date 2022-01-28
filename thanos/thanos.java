import java.util.Scanner;
import java.lang.Math;

public class thanos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int t = scanner.nextInt();
            
            for(int i = 0; i < t; i++){
                long p = scanner.nextLong(), r = scanner.nextLong(), f = scanner.nextLong(), y = 0;
                
                while(p <= f){
                    p = p * r;
                    y++;
                }
                
                System.out.println(y);
            }
        }
    }
}