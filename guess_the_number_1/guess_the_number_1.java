import java.util.Scanner;

public class guess_the_number_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int left = 0, right = 1000, cursor = 500;
        String response;
        
        do {
            System.out.println(cursor);
            response = scanner.next();
            
            switch(response){
                case "lower":
                    right = cursor;
                    break;
                case "higher":
                    left = cursor;
                    break;
            }
            
            cursor = right - ((right - left) >> 1);
        } while(!response.equals("correct"));
    }
}