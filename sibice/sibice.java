import java.util.Scanner;
import java.lang.Math;

public class sibice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int matches = scanner.nextInt(), width = scanner.nextInt(), height = scanner.nextInt();
            String fits = "";
            
            for(int i = 0; i < matches; i++){
                int match_size = scanner.nextInt();
                
                if(match_size <= width || match_size <= height || match_size <= Math.sqrt(Math.pow(width,2) + Math.pow(height,2))){
                    fits += "DA\n";
                }
                
                else {
                    fits += "NE\n";
                }
            }
        
            System.out.println(fits.trim());
        }
    }
}