import java.util.Scanner;

public class pyramidebyggeri {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int blocks = scanner.nextInt(), level_blocks = 1, side = 1, level = 1;
            
            while(level_blocks < blocks){
                side += 2;
                level++;
                level_blocks += Math.pow(side,2);
            }
            
            System.out.println(level_blocks == blocks ? level : level-1);
        }
    }
}