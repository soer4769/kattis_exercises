import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class reverse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        ArrayList<Long> numbers = new ArrayList<Long>();
        
        while(n--> 0){
            numbers.add(scanner.nextLong());
        }
        
        Collections.reverse(numbers);
        
        for(Long number : numbers){
            System.out.println(number);
        }
        
        scanner.close();
    }
}