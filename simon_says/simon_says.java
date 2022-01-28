import java.util.Scanner;

public class simon_says {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++){
            String p = scanner.nextLine();
            
            if(p.contains("Simon says")){
                System.out.println(p.substring(11));
            }
        }
        
        scanner.close();
    }
}
