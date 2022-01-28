import java.util.Arrays;
import java.util.Scanner;

public class polynomial_multiplication_1 {
    static Scanner scanner = new Scanner(System.in);
    
    public static int[] getInput(){
        int n = scanner.nextInt();
        int[] poly = new int[n+1];
        
        for(int i = 0; i < (n+1); i++){
            poly[i] = scanner.nextInt();
        }
        
        return poly;
    }
    
    public static void main(String[] args){
        while(scanner.hasNext()){
            int t = scanner.nextInt()*2;
            
            while(t--> 0){
                int[] p1 = getInput(), p2 = getInput(), p3 = new int[p1.length+p2.length-1];
                
                System.out.println(p1.length + ", " + p2.length);
                
                for(int i = 0; i < p1.length; i++){
                    for(int j = 0; j < p2.length; j++){
                        p3[i+j] += p1[i]*p2[j];
                    }
                }
                
                System.out.println(Arrays.toString(p3));
            }
        }
    }
}