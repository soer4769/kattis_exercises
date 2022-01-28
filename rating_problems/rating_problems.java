import java.util.Scanner;

public class rating_problems {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int total_judges = scanner.nextInt(), rated_judges = scanner.nextInt();
            float min_rating = 0, max_rating = 0;
            
            for(int i = 0; i < rated_judges; i++){
                min_rating = max_rating += scanner.nextInt();
            }
            
            for(int j = 0; j < (total_judges-rated_judges); j++){
                min_rating += -3;
                max_rating += 3;
            }
            
            min_rating /= total_judges;
            max_rating /= total_judges;
            
            System.out.println(min_rating + " " + max_rating);
        }
    }
}
