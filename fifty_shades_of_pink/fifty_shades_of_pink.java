import java.util.Scanner;

public class fifty_shades_of_pink {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(), sessions = 0;
        
        for(int i = 0; i < n; i++){
            String match = scanner.next().toLowerCase();
            
            if(match.contains("rose") || match.contains("pink")){
                sessions++;
            }
        }
        
        System.out.println((sessions > 0 ? sessions : "I must watch Star Wars with my daughter"));
        scanner.close();
    }
}
