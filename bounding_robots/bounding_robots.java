import java.util.Scanner;
import java.lang.Math;

public class bounding_robots {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int w = scanner.nextInt(), l = scanner.nextInt();
            int xa = 0, ya = 0, xb = 0, yb = 0;
            
            if(w == 0 && l == 0){
                break;
            }
            
            int i = scanner.nextInt();
            
            for(int j = 0; j < i; j++){
                String x = scanner.next();
                int y = ((x.equals("d") || x.equals("l")) ? scanner.nextInt()*-1 : scanner.nextInt());
                
                if(x.equals("u") || x.equals("d")){
                    ya += y;
                    yb = ((yb+y) > (l-1) ? Math.min(yb+y,l-1) : Math.max(yb+y,0));
                }
                
                else {
                    xa += y;
                    xb = ((xb+y) > (w-1) ? Math.min(xb+y,w-1) : Math.max(xb+y,0));
                }
            }

            System.out.println("Robot thinks " + xa + " " + ya + "\nActually at " + xb + " " + yb);
        }
    }
}