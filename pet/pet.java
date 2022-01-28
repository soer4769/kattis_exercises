import java.util.Scanner;

public class pet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int c = 0, p = 0;
            
            for(int i = 0; i < 5; i++){
                int t = scanner.nextInt()+scanner.nextInt()+scanner.nextInt()+scanner.nextInt();
                
                if(t > p){
                    p = t;
                    c = i;
                }
            }
            
            System.out.println((c+1) + " " + p);
        }
    }
}
