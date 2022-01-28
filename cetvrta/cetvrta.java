import java.util.Scanner;

public class cetvrta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt(), y=scanner.nextInt(), n1, n2;
        
        for(int i = 0; i < 2; i++){
            int x1 = scanner.nextInt(), y1 = scanner.nextInt();
            
            if(x1!=x){
                n1 = x1;
            }
            
            if(y1!=y){
                n2 = y1;
            }
            
            x=x1;
            y=y1;
        }
        
        System.out.println(x + " " + y);
        scanner.close();
    }
}