import java.util.Scanner;
import java.util.ArrayList;

public class hoest_problem_b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            ArrayList<String> words = new ArrayList<String>();
            
            do {
                words.add(scanner.next());
            } while(!words.get(words.size()-1).endsWith("?"));
            
            String temp = words.get(0);
            words.set(0, words.get(1).substring(0, 1).toUpperCase() + words.get(1).substring(1));
            words.set(1, temp.toLowerCase());
            
            System.out.println(String.join(" ", words).replace("?", "!"));
        }
    }
}