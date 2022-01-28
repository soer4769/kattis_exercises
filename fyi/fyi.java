import java.util.Scanner;

public class fyi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            if(scanner.next().substring(0,3).equals("555")){
                System.out.println(1);
                continue;
            }
            
            System.out.println(0);
        }
    }
}