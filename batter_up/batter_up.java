import java.util.Scanner;

public class batter_up {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n = scanner.nextInt(), p = n, k = 0;
            
            for(int i = 0; i < n; i++){
                int b = scanner.nextInt();
                
                if(b >= 0){
                    k += b;
                }
                
                else {
                    p--;
                }
            }
            
            System.out.println((double) k/p);
        }
    }
}