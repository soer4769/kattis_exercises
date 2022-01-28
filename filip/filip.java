import java.util.Scanner;

public class filip {
    public static int flip(String num){
        return Integer.parseInt(new StringBuilder(num).reverse().toString());
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n1 = flip(scanner.next()), n2 = flip(scanner.next());
            System.out.println((n1 > n2 ? n1 : n2));   
        }
    }
}