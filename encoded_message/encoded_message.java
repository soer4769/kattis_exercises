import java.util.Scanner;

public class encoded_message {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        while(n--> 0){
            String encoded = scanner.next(), decoded = "";
            
            for(int i = 0; i < encoded.length(); i++){
                double square = Math.sqrt(encoded.length());
                
                
                decoded += encoded.charAt(i/));
            }
        }
        
        scanner.close();
    }
}