import java.util.Scanner;

public class cold_puter_science {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int counter = scanner.nextInt(), lthz = 0;
            
            for(int i = 0; i < counter; i++){
                if(scanner.nextInt() < 0){
                    lthz++;
                }
            }
            
            System.out.println(lthz);
        }
    }
}
