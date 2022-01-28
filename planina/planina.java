import java.util.Scanner;

public class planina {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println(String.format("%.0f", Math.pow(Math.pow(2,scanner.nextLong()) + 1,2)));
        }
    }
}