import java.util.Scanner;

public class take_two_stones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println(scanner.nextInt() % 2 == 0 ? "Bob" : "Alice");
        }
    }
}