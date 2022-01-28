import java.util.Scanner;

public class the_last_problem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        
        while(scanner.hasNext()){
            name += " " + scanner.next();
        }
        
        System.out.println("Thank you, " + name + ", and farewell!");
    }
}