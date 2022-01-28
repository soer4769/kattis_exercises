import java.util.Scanner;

public class ladder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println((scanner.nextInt() * Math.sin(90)) / Math.sin(180-90-scanner.nextInt()));
        }
    }
}