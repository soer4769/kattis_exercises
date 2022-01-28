import java.util.Scanner;
import java.util.Arrays;

public class hoest_problem_r {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            Integer[] numbers = new Integer[25];
            int marked = 4096, full = 0;
            
            Arrays.fill(numbers, 0);
            scanner.next();
            scanner.nextLine();
            
            for(int i = 0; i < 25; i++){
                if(scanner.hasNextInt()){
                    numbers[i] = scanner.nextInt();
                    continue;
                }
                
                scanner.next();
            }
            
            //System.out.println(Arrays.toString(numbers));
            
            for(int j = 0; j < 75; j++){
                int curr_num = scanner.nextInt();
                
                if(Arrays.stream(numbers).anyMatch(n -> n == curr_num)){
                    marked |= 1 << Arrays.asList(numbers).indexOf(curr_num);
                    //System.out.println(Integer.toBinaryString(marked));
                    
                    for(int k = 0; k < 5; k++){
                        //System.out.println(Integer.toBinaryString(0x108421 << k));
                        
                        if(((marked & (0x1F << (k*5))) == (0x1F << (k*5)) 
                        || (marked & (0x108421 << k)) == (0x108421 << k) 
                        || (marked & 0x111110) == 0x111110
                        || (marked & 0x1041041) == 0x1041041) && full == 0
                        || ((marked & 0x1FFFFFF) == 0x1FFFFFF) && full == 1){
                            System.out.println(curr_num + " bingo!");
                            //System.out.println(Integer.toBinaryString(marked));
                            full++;
                            break;
                        }
                    }
                }
            }
            
            //System.out.println("\n");
        }
    }
}