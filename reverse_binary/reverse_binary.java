import java.util.Scanner;

public class reverse_binary {
    public static long reverseBinary(long num){
        return Long.parseLong(new StringBuilder(Long.toBinaryString(num)).reverse().toString(),2);
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println(reverseBinary(scanner.nextLong()));
        }
    }
}