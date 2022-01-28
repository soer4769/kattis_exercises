import java.util.Scanner;
import java.util.regex.*;

public class smil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String smil = scanner.next(), pattern = "(\\:\\)|\\;\\)|\\:\\-\\)|\\;\\-\\))+";
            long count = Pattern.compile(pattern).matcher(pattern).results().count();
            System.out.println(count);
        }
    }
}