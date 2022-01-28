import java.util.Scanner;

public class hissing_microphone {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next().contains("ss") ? "hiss" : "no hiss");
        scanner.close();
    }
}