import java.util.Scanner;

public class guess_the_number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String response = "";
        int n1 = 0, n2 = 500, n2pre = 1000;
        
        while(!response.equals("correct")){            
            System.out.println(n2);
            response = scanner.next();
            
            switch(response){
                case "lower":
                    n2pre = n2;
                    n2 = n2 - (n2 - n1) / 2;
                    break;
                case "higher":
                    n1 = n2;
                    n2 = n2pre - (n2pre - n1) / 2;
                    break;
            }
        }
    }
}