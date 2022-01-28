import java.util.Scanner;

public class missing_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String out = "";
            int n = scanner.nextInt(), r = 0, p;
            
            for(int j = 0; j < n; j++){
                p = scanner.nextInt();
                
                if((p - r) > 1){
                    for(int i = (r+1); i < p; i++){
                        out += i + "\n";
                    }
                }
                
                r = p;
            }
            
            System.out.println((out.length() > 0 ? out.trim() : "good job"));
        }
    }
}