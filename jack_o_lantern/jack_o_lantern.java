import java.util.Scanner;

public class jack_o_lantern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println(scanner.nextLong() * scanner.nextLong() * scanner.nextLong());
        }
    }
}