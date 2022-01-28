import java.util.Scanner;

public class alphabet_spam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String spam = scanner.next();
            int w = 0, u = 0, l = 0, s = 0, t = 0, c;
            
            for(int i = 0; i < spam.length(); i++){
                c = spam.charAt(i);
                
                if(c == 95){
                    w++;
                } else if(c > 64 && c <  91){
                    u++;
                } else if(c > 96 && c < 123){
                    l++;
                } else {
                    s++;
                }
            }
            
            t = w + u + l + s;
            System.out.println(((double) w/t) + "\n" + ((double) l/t) + "\n" + ((double) u/t) + "\n" + ((double) s/t));
        }
    }
}