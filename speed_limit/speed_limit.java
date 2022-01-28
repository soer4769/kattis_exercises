import java.util.Scanner;

public class speed_limit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n;
        
        while((n = scanner.nextInt()) > 0){
            int distance = 0, time = 0;
            
            while(n--> 0){
                int miles = scanner.nextInt(), hours = scanner.nextInt();

                distance += miles * (hours - time);
                time = hours;
            }

            System.out.println(distance + " miles");
        }
        
        scanner.close();
    }
}