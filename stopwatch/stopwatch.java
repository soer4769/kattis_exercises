import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            boolean running = false;
            int n = scanner.nextInt(), time = 0;
            
            for(int i = 0; i < n; i++){
                if(running = !running){
                    time += scanner.nextInt();
                    continue;
                }
                
                time -= scanner.nextInt();
            }
            
            System.out.println((running ? "still running" : Math.abs(time)));
        }
    }
}
