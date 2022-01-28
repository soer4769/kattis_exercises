import java.util.Scanner;

public class last_factorial_digit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int t = scanner.nextInt();
            
            do {
                int n = scanner.nextInt(), f = 0;
                
                if(n == 3){
                    f = 6;
                } else if(n < 3 || n == 4){
                    f = n;
                }
                
                System.out.println(f);
            } while((t -= 1) > 0);
        }
    }
}