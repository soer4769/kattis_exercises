import java.util.Scanner;

public class cryptographers_conundrum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String name = "PER", text = scanner.next();
        int days = 0;
        
        for(int i = 0; i < text.length(); i++){
            if(name.charAt(i%3) != text.charAt(i)){
                days++;
            }
        }
        
        System.out.println(days);
        scanner.close();
    }
}