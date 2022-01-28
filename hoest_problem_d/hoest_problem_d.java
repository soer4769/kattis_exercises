import java.util.Scanner;

public class hoest_problem_d {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt(), b = scanner.nextInt(), forskel = (Math.max(a,b)-Math.min(a,b)), min = Math.min(forskel,360-forskel);
        System.out.println(((a+min)%360) == b ? min : min*-1);
        scanner.close();
    }
}