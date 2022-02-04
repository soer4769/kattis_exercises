import java.util.Scanner;

class nsum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), sum = 0;

        while(n-- > 0){
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}
