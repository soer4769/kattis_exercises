import java.util.Scanner;

public class pot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int n = scanner.nextInt(), p = 0;
        
            for(int i = 0; i < n; i++){
                String s = scanner.next(), s1 = s.substring(0, s.length()-1), s2 = s.substring(s.length()-1,s.length());
                p += Math.pow(Integer.parseInt(s1),Integer.parseInt(s2));
            }
            
            System.out.println(p);
        }
    }
}