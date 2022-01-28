import java.util.Scanner;

public class hoest_problem_h {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int t = scanner.nextInt();
            
            for(int i = 1; i <= t; i++){
                if(i%3 == 0 && i%5 == 0){
                    System.out.println("øfgrynt");
                }
                
                else if(i%3 == 0){
                    System.out.println("øf");
                }
                
                else if(i%5 == 0){
                    System.out.println("grynt");
                }
                
                else {
                    System.out.println(i%100);
                }
            }
        }
    }
}