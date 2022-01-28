import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class hoest_problem_k {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            ArrayList<String> animals_max = new ArrayList();
            String[] animals = scanner.nextLine().split(" ");
            int[] count = new int[animals.length], count_temp;
            int n = scanner.nextInt(), max_num = 0; 
            
            scanner.nextLine();
            
            while(n--> 0){
                String sentence = scanner.nextLine().toLowerCase();
                count_temp = new int[animals.length];
                int max_count = 0;
                
                for(int i = 0; i < animals.length; i++){
                    count_temp[i] = Collections.frequency(Arrays.asList(sentence.replaceAll("[,.!]", " ").split(" ")), animals[i]);
                    max_count = (count_temp[i] > count_temp[max_count] ? i : max_count);
                }
                
                count[max_count]++;
                max_num = Math.max(count[max_count], max_num);
            }
            
            for(int j = 0; j < animals.length; j++){
                if(count[j] == max_num){
                    animals_max.add(animals[j]);
                }
            }
            
            Collections.sort(animals_max);
            animals_max.forEach(System.out::println);
        }
    }
}