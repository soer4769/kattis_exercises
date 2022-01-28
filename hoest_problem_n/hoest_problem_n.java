import java.util.Scanner;
import java.util.ArrayList;

public class hoest_problem_n {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int x = scanner.nextInt(), y = scanner.nextInt();
            ArrayList<Integer> vmidts = new ArrayList();
            String circle = "";
            scanner.nextLine();
            
            for(int h = 0; h < y; h++){
                circle += scanner.nextLine();
            }
            
            for(int i = 0; i < y; i++){
                int start = -1, end = -1;
                boolean inside = false;
                
                for(int j = 0; j < x; j++){
                    int cell = i*x+j;
                    
                    if(circle.charAt(cell) == '#' && !inside){
                        inside = !inside;
                        start  = (start < 0 && inside ? cell : start);
                    }
                    
                    if(((cell+1) % x == 0 || circle.charAt(cell+1) == '.') && inside){
                        inside = !inside;
                        end    = (end < 0 && !inside  ? cell : end);
                    }
                    
                    if(start >= 0 && end >= 0){
                        int midt = start+(end-start)/2;
                        
                        if(((midt-x) < 0 || circle.charAt(midt-x) == '.') || ((midt+x) >= circle.length() || circle.charAt(midt+x) == '.')){
                            vmidts.add(midt);
                            //circle = circle.substring(0, midt) + "@" + circle.substring(midt+1);
                            //System.out.println("s: " + start + ", e: " + end + ", midt: " + midt);
                        }
                        
                        start = end = -1;
                    }
                }
            }
            
            start:
            for(int i = 0; i < vmidts.size(); i++){
                for(int j = i; j < vmidts.size(); j++){
                    boolean space_above = ((vmidts.get(i)-x) <= 0 || circle.charAt(vmidts.get(i)-x) == '.');
                    boolean space_below = ((vmidts.get(i)+x) >= circle.length() || circle.charAt(vmidts.get(i)+x) == '.');
                    
                    if((i < j || i == j && space_above && space_below) && (vmidts.get(i)%x) == (vmidts.get(j)%x)){
                        int midtx = (vmidts.get(i)%x), midty = (int) Math.floor((vmidts.get(i)/x)+(vmidts.get(j)-vmidts.get(i))/(2*x)), coord = midty*x+midtx;
                        
                        if(circle.charAt(coord) != '.'){
                            //circle = circle.substring(0, coord) + "@" + circle.substring(coord+1);
                            System.out.println(midtx + " " + midty);
                        }
                        continue start;
                    }
                }
            }
            /*
            for(int i = 0; i < y; i++){
                System.out.println(circle.substring(i*x, i*x+x));
            }
            
            System.out.println();*/
        }
    }
}