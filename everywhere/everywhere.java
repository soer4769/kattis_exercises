import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class everywhere {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(), n;
        
        for(int i = 0; i < t; i++){
            Set<String> cities = new HashSet<String>();
            n = scanner.nextInt();
            
            for(int j = 0; j < n; j++){
                cities.add(scanner.next());
            }
            
            System.out.println(cities.size());
        }
        
        scanner.close();
    }
}