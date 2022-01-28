import java.util.Scanner;

public class trik {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String positions = scanner.next();
        int final_pos = 1;
        
        for(int i = 0; i < positions.length(); i++){
            if((positions.charAt(i) == 'A' && final_pos != 3) 
            || (positions.charAt(i) == 'B' && final_pos != 1) 
            || (positions.charAt(i) == 'C' && final_pos != 2)){
                switch(positions.charAt(i)){
                    case 'A':
                        final_pos += (final_pos == 1 ? 1 : -1);
                        break;
                    case 'B':
                        final_pos += (final_pos == 2 ? 1 : -1);
                        break;
                    case 'C':
                        final_pos += (final_pos == 1 ? 2 : -2);
                        break;
                }   
            }
        }
        
        System.out.println(final_pos);
    }
}