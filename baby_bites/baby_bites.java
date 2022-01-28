import java.util.Scanner;

public class baby_bites {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int bites = scanner.nextInt();
            String result = "makes sense";
            
            for(int i = 0; i < bites; i++){
                String num = scanner.next();
                
                if(!num.equals("mumble") && Integer.parseInt(num) != (i+1) && !result.equals("something is fishy")){
                    result = "something is fishy";
                }
            }
            
            System.out.println(result);
        }
    }
}