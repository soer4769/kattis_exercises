import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class license_to_launch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            long n = scanner.nextLong();
            ArrayList<Long> junk = new ArrayList<Long>();
            
            for(int i = 0; i < n; i++){
                junk.add(scanner.nextLong());
            }
            
            System.out.println(junk.indexOf(Collections.min(junk)));
        }
    }
}