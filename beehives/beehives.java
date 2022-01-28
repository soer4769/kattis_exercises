import java.util.Scanner;
import java.util.Locale;

public class beehives {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            double d = scanner.nextDouble();
            int n = scanner.nextInt(), sour = 0;
            double[][] c = new double[n][2];
            
            if(d > 0 && n > 0){
                for(int i = 0; i < n; i++){
                    c[i] = new double[]{scanner.nextDouble(), scanner.nextDouble()};
                }
                
                for(int j = 0; j < n; j++){
                    for(int k = 0; k < n; k++){
                        if(j != k && Math.sqrt(Math.pow(c[k][0]-c[j][0],2)+Math.pow(c[k][1]-c[j][1],2)) < d){
                           sour++;
                           break;
                        }
                    }
                }

                System.out.println(sour + " sour, " + (n-sour) + " sweet");
            }
        }
    }
}