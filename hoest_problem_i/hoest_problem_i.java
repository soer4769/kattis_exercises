import java.util.Scanner;

public class hoest_problem_i {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int k = scanner.nextInt(), n = scanner.nextInt();
            String[] a = new String[n];
            String name = "";
            
            for(int i = 0; i < n; i++){
                a[i] = scanner.next();
            }
            
            outerloop:
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(a[i] != a[j] && (a[i] + a[j]).length() == k){
                        name = (a[i] + a[j]).toLowerCase();
                        break outerloop;
                    }
                }
            }
            
            System.out.println(name.length() > 0 ? name : "*umuligt*");
        }
    }
}