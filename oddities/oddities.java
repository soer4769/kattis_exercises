import java.util.Scanner;

public class oddities {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n = scanner.nextInt(), k;
            
            for(int i = 0; i < n; i++){
                k = scanner.nextInt();
                System.out.println(k + ((k & 1) == 0 ? " is even" : " is odd"));
            }
        }
    }
}
