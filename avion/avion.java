import java.util.Scanner;

public class avion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String output = "";
        
        for(int i = 0; i < 5; i++){
            if(scanner.next().contains("FBI")){
                output += " " + (i+1);
            }
        }
        
        System.out.println(output.length() > 0 ? output.trim() : "HE GOT AWAY!");
        scanner.close();
    }
}