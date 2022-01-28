import java.util.Scanner;

public class number_fun {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        float a, b, c;
        
        while(n--> 0){
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            
            if((a+b==c) || (a-b==c) || (b-a==c)
            || (a*b==c) || (a/b==c) || (b/a==c)){
                System.out.println("Possible");
                continue;
            }
            
            System.out.println("Impossible");
        }
        
        scanner.close();
    }
}