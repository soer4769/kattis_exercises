import java.util.Scanner;

public class hoest_problem_l {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n = scanner.nextInt(), input;
            double sum = 0;
            
            for(int i = 0; i < n; i++){
                input = scanner.nextInt();
                
                if(input < 10 || input > 2000){
                    n--; i--;
                    
                    if((n-1) > i){
                        n--;
                        scanner.nextInt();
                    }
                    
                    continue;
                }
                
                sum += input;
            }
            
            System.out.println(sum/n);
        }
    }
}