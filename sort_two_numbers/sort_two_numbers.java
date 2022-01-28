import java.util.Scanner;
import java.util.Arrays;

public class sort_two_numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] n = {scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(n);
        System.out.println(n[0] + " " + n[1]);
    }
}