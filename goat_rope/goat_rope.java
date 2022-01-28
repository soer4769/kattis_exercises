import java.util.Scanner;

public class goat_rope {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            long x1 = scanner.nextLong(), y1 = scanner.nextLong();
            long x2 = scanner.nextLong(), y2 = scanner.nextLong();
            long x3 = scanner.nextLong(), y3 = scanner.nextLong();
            
            System.out.println(Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2)));
        }
    }
}