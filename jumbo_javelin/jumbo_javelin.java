import java.util.Scanner;

public class jumbo_javelin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n = scanner.nextInt(), l = 0;
            
            for(int i = 0; i < n; i++){
                l += scanner.nextInt();
            }
            
            System.out.println(l-n+1);
        }
    }
}