import java.util.Scanner;

public class homework {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String[] problems = scanner.next().split(";");
            int n = 0;
            
            for(int i = 0; i < problems.length; i++){
                if(problems[i].contains("-")){
                    String[] range = problems[i].split("-");
                    n += Integer.parseInt(range[1]) - Integer.parseInt(range[0]) + 1;
                    continue;
                }
                
                n++;
            }
            
            System.out.println(n);
        }
    }
}