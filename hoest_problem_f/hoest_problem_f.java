import java.util.Scanner;

public class hoest_problem_f {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int num = 0, min = 0, max = 0;
        
        while(scanner.hasNext()){
            switch(scanner.nextLine()){
                case "Får ind":
                    num++;
                    max = Math.max(num,max);
                    break;
                case "Får ud":
                    num--;
                    min = Math.min(num,min);
                    break;
            }
        }
        
        System.out.println(max + Math.abs(min));
        scanner.close();
    }
}