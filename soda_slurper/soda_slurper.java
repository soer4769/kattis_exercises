import java.util.Scanner;

public class soda_slurper {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int bottles = scanner.nextInt() + scanner.nextInt(), requirement = scanner.nextInt(), temp = 0, drinks = 0;
            
            while(bottles >= requirement){
                temp = bottles % requirement;
                drinks += bottles / requirement;
                bottles = temp + (bottles / requirement);
            }
            
            System.out.println(drinks);
        }
    }
}