import java.util.Scanner;

public class aaah {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println((scanner.next().length() >= scanner.next().length()) ? "go" : "no");   
        }
    }
}