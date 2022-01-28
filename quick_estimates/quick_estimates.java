import java.util.Scanner;

public class quick_estimates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        while(n-- > 0){
            System.out.println(scanner.next().length());
        }
        
        scanner.close();
    }
}