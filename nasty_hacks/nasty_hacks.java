import java.util.Scanner;

public class nasty_hacks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            
            for(int i = 0; i < n; i++){
                long r = scanner.nextLong(), e = scanner.nextLong(), c = scanner.nextLong();
                long a = e - r - c;
                
                if(a > 0){
                    System.out.println("advertise");
                }
                
                else if(a < 0){
                    System.out.println("do not advertise");
                }
                
                else {
                    System.out.println("does not matter");
                }
            }
        }
    }
}