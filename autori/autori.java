import java.util.Scanner;

public class autori {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println(scanner.next().replaceAll("[a-z-]+", ""));
        }
    }
}