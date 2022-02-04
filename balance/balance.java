import java.util.Scanner;
import java.util.Stack;

public class balance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack<Character> stack = new Stack<>();

        if(input.length()%2 != 0){
            System.out.println(0);
        }

        else if(input.length() == 0){
            System.out.println(1);
        }

        else {
            for(int i = 0; i < input.length(); i++){
                char c = input.charAt(i);

                if(stack.size() > 0 && (stack.peek() == '(' && c == ')'
                || stack.peek() == '[' && c == ']'
                || stack.peek() == '{' && c == '}')){
                    stack.pop();
                    continue;
                }

                stack.push(c);
            }

            System.out.println(stack.size() == 0 ? 1 : 0);
        }
    }
}
