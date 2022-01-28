import java.util.Scanner;

public class judging_moose {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int a = scanner.nextInt(), b = scanner.nextInt();
            
            if(a == 0 && b == 0){
                System.out.println("Not a moose");
            } else if(a == b){
                System.out.println("Even " + (a+b));
            } else if(a != b){
                System.out.println("Odd " + (Math.max(a,b)*2));
            }
        }
    }
}