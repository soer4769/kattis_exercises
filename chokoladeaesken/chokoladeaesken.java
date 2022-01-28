import java.util.Scanner;

public class chokoladeaesken {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int obs = scanner.nextInt(), antal = 0, fobs = 999;
            
            for(int i = 0; i < obs; i++){
                int stykker = scanner.nextInt();
                
                if(fobs < stykker){
                    antal++;
                }
                
                fobs = stykker;
            }
            
            System.out.println(antal);
        }
    }
}