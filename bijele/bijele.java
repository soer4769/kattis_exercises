import java.util.Scanner;

public class bijele {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String[] set = {"1","1","2","2","2","8"};
            
            for(int i = 0; i < 6; i++){
                set[i] = String.valueOf(Integer.parseInt(set[i]) - scanner.nextInt());
            }
            
            System.out.println(String.join(" ", set));
        }
    }
}
