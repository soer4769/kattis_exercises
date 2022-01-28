import java.util.Scanner;

public class greetings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String response = scanner.next(), answer = "h";
            
            for(int i = 0; i < (response.length()-2)*2; i++){
                answer += "e";
            }
            
            System.out.println(answer + "y");
        }
    }
}