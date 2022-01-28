import java.util.Scanner;

public class electrical_outlets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            short n = scanner.nextShort();
            String s = "";
            
            for(short i = 0; i < n; i++){
                int k = scanner.nextShort(), t = 0;
                
                for(short j = 0; j < k; j++){
                    t += scanner.nextInt();
                }
                
                s += (t-k+1) + "\n";
            }
            
            System.out.println(s);
        }
    }
}