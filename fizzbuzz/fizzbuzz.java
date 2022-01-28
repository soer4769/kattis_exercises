import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt(), y = scanner.nextInt(), n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++){
            String output = "";
            
            if(i%x == 0){
                output = "Fizz";
            }
            
            if(i%y == 0){
                output += "Buzz";
            }
            
            if(i%x != 0 && i%y != 0){
                output = ("" + i);
            }
            
            System.out.println(output);
        }
        
        scanner.close();
    }
}
