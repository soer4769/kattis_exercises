import java.util.Scanner;

public class seven_wonders {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String deck = scanner.next();
            int t = 0, c = 0, g = 0;
            
            for(int i = 0; i < deck.length(); i++){
                switch(deck.charAt(i)){
                    case 'T':
                        t++;
                        break;
                    case 'C':
                        c++;
                        break;
                    case 'G':
                        g++;
                        break;
                }
            }
            
            System.out.println(t + " " + c + " " + g);
            
            System.out.println(Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2) + (t>=3?7:0) + (c>=3?7:0) + (g>=3?7:0));
        }
    }
}
