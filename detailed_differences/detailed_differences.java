import java.util.Scanner;

public class detailed_differences {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        
        for(int i = 0; i < cases; i++){
            String n1 = scanner.next(), n2 = scanner.next(), diff = "";
            
            for(int j = 0; j < n1.length(); j++){
                diff += (n1.charAt(j) == n2.charAt(j) ? '.' : '*');
            }
            
            System.out.println(n1 + "\n" + n2 + "\n" + diff + "\n");
        }
    }
}