import java.util.Scanner;
import java.util.regex.*;

public class soft_passwords {
    public static String reverse_letters(String word){
        String reversed = "";
        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) > 64 && word.charAt(i) < 91){
                reversed += (char) (word.charAt(i) + 32);
            }
            
            else if(word.charAt(i) > 96 && word.charAt(i) < 123){
                reversed += (char) (word.charAt(i) - 32);
            }
            
            else {
                reversed += word.charAt(i);
            }
        }
        
        return reversed;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String s = scanner.next(), p = scanner.next();
            
            if(s.equals(p) ^ s.equals(reverse_letters(p)) ^ Pattern.compile("^("+s+"[0-9]?|[0-9]?"+s+")$").matcher(p).matches()){
                System.out.println("Yes");
                continue;
            }
            
            System.out.println("No");
        }
    }
}