import java.util.Scanner;
import java.util.Arrays;

class magictrick {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] cards = scanner.nextLine().toCharArray();
        Arrays.sort(cards);

        //if(cards.length == 1)
        //    System.out.println(1);

        for(int i = 1; i < cards.length; i++){
            if(cards[i-1] == cards[i]){
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
