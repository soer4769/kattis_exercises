import java.util.Scanner;

public class gaet_et_tal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String response = "";
        int n1 = 0, n2 = 500, n2pre = 1000;
        
        while(!response.equals("rigtigt")){            
            System.out.println(n2);
            response = scanner.next().replace("�", "ø");
            
            switch(response){
                case "mindre":
                    n2pre = n2;
                    n2 = n2 - (n2 - n1) / 2;
                    break;
                case "større":
                    n1 = n2;
                    n2 = n2pre - (n2pre - n1) / 2;
                    break;
            }
        }
    }
}