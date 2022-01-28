import java.util.Scanner;

public class no_duplicates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        
        for(String word : statement.split(" ")){
            if(((statement.length() - statement.replaceAll("\\b"+word+"\\b", "").length()) / word.length()) > 1){
                System.out.println("no");
                scanner.close();
                return;
            }
        }
        
        System.out.println("yes");
        scanner.close();
    }
}