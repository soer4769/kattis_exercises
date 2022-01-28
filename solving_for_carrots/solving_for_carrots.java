import java.util.Scanner;

public class solving_for_carrots {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(), p = scanner.nextInt();
        String s = "" + p;
        scanner.nextLine();

        for(int i = 0; i < n; i++){
            scanner.nextLine();
        }

        System.out.println(s);
        scanner.close();
    }
}