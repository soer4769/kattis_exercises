import java.util.Scanner;

public class hoest_problem_p {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        
        int r1, r2, r3;
        double x, y, z;
        
        System.out.println("? 0 0"); 
        r1 = scanner.nextInt();

        System.out.println("? 100 0");
        r2 = scanner.nextInt();

        System.out.println("? 50 100");
        r3 = scanner.nextInt();
        
        // https://en.wikipedia.org/wiki/True-range_multilateration
        x = (r1 - r2 + 10000)/200;
        y = (r1 - r3 + 12500 - 100 * x)/200;
        z = Math.sqrt(r1 - Math.pow(x,2) - Math.pow(y,2));

        System.out.println("! " + (int) Math.round(x) + " " + (int) Math.round(y) + " " + (int) Math.round(z));
    }
}