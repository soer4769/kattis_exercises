import java.util.Scanner;

public class tri {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int[] n = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
            String equation = "", operators[] = {"=", "="};
            
            for(int i = 0; i < 2; i++){
                if(n[i] + n[i+1] == n[(i+2)%3]){
                    operators[i] = "+";
                    break;
                }
                
                else if(n[i] - n[i+1] == n[(i+2)%3]){
                    operators[i] = "-";
                    break;
                }
                
                else if(n[i] * n[i+1] == n[(i+2)%3]){
                    operators[i] = "*";
                    break;
                }
                
                else if(n[i+1] > 0 && n[i] / n[i+1] == n[(i+2)%3]){
                    operators[i] = "/";
                    break;
                }
            }
            
            equation = n[0] + operators[0] + n[1] + operators[1] + n[2];
            System.out.println(equation);
        }
    }
}