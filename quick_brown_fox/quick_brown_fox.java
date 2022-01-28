import java.util.Scanner;

public class quick_brown_fox {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int cases = scanner.nextInt();
        scanner.nextLine();
        
        while(0 < cases--){
            String pangram = scanner.nextLine().toLowerCase(), alphabet = "abcdefghijklmnopqrstuvwxyz", missing = "";
            
            for(int i = 0; i < 26; i++){
                if(!pangram.contains("" + alphabet.charAt(i))){
                    missing += alphabet.charAt(i);
                }
            }
            
            System.out.println((missing.length() == 0 ? "pangram" : "missing " + missing));
        }
        
        scanner.close();
    }
}