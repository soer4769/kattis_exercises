import java.util.Scanner;

public class hoest_problem_s {
    private static String field_back(final int x, final int y){
        return ((x > 0 || y > 0) ? "<" + "^".repeat(x) + ">" + "^".repeat(y) : "");
    }
    
    private static String field_harvest(final int b, final int h, final int x, final int y){
        if(h != 1) {
            String combine = ("^".repeat(h-1) + "<^<" + "^".repeat(h-1) + ">^>").repeat((int) Math.ceil(b/2.0)).substring(0, b*(h+2));
            return (field_back(x,y) + "<<" + combine.substring(0, combine.length()-3) + "<<".repeat(b%2) + field_back(b-1,(b%2)*(h-1))).replaceAll("<<<", ">");
        }
        
        return (">" + "^".repeat(b-x-1) + "<" + field_back((b-1),0)).replaceAll("><<", "<");
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            System.out.println(field_harvest(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
    }
}