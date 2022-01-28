import java.util.Scanner;

public class timeloop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int counter = scanner.nextInt();
            
            for(int i = 0; i < counter; i++){
                System.out.println((i+1) + " Abracadabra");
            }
        }
    }
}
