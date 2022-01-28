import java.util.Scanner;

public class tarifa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int x = scanner.nextInt(), n = scanner.nextInt(), p = 0;
            
            for(int i = 0; i < n; i++){
                p += scanner.nextInt();
            }
            
            System.out.println(x*(n+1)-p);   
        }
    }
}