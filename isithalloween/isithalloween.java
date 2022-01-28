import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String date = scanner.next() + " " + scanner.next();
            System.out.println((date.equals("OCT 31") || date.equals("DEC 25")) ? "yup" : "nope");
        }
    }
}
