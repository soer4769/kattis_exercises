import java.util.Scanner;

public class hoest_problem_e {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int pinkode = scanner.nextInt()+100001;
        String vendt = new StringBuilder(String.valueOf(pinkode)).reverse().toString();
        String opringlig = vendt.substring(0, 4);
        System.out.println(opringlig);
        
        scanner.close();
    }
}