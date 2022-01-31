import java.util.Scanner;

public class oddecho {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i < (N+1); i++){
            if((i%2)==0){
                scanner.nextLine();
            } else {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
