import java.util.Scanner;

public class free_food {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int events = scanner.nextInt(), n1 = 0, n2 = 0;
        
        while(events-- > 0){
            n1 += scanner.nextInt();
            n2 += scanner.nextInt();
        }
        
        System.out.println(days);
        scanner.close();
    }
}