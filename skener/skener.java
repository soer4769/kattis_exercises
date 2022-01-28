import java.util.Scanner;

public class skener {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int r = scanner.nextInt(), c = scanner.nextInt(), zr = scanner.nextInt(), zc = scanner.nextInt();
            String fstr = "";
            
            for(int i = 0; i < r; i++){
                String row = scanner.next() + "\n";
                
                row = row.replaceAll("\\.", new String(".").repeat(zc));
                row = row.replaceAll("x", new String("x").repeat(zc));
                row = row.repeat(zr);
                fstr += row;
            }
            
            System.out.println(fstr.trim());
        }
    }
}