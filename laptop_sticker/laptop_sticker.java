import java.util.Scanner;

public class laptop_sticker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int wc = scanner.nextInt(), hc = scanner.nextInt();
        int ws = scanner.nextInt(), hs = scanner.nextInt();
        boolean wf = (wc-ws) > 1, hf = (hc-hs) > 1;
        
        System.out.println((wf&&hf) ? 1 : 0);
        scanner.close();
    }
}