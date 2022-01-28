import java.util.Scanner;

public class apaxians {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        StringBuilder name = new StringBuilder(scanner.nextLine());
        int i = 0;
        
        if(name.length() > 1){
            while(++i < name.length()){
                if(name.charAt(i) == name.charAt(i-1)){
                    name = name.deleteCharAt(i);
                    i--;
                }
            }
        }
        
        System.out.println(name);
        scanner.close();
    }
}