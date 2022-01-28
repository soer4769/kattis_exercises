import java.util.Scanner;

public class hoest_problem_c {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            double n = scanner.nextInt(), k = scanner.nextInt(), h = scanner.nextInt();
            System.out.println((long) Math.ceil(Math.max(n/h-k,0)));
        }
    }
}