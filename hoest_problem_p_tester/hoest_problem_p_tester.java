import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.nio.charset.StandardCharsets;

public class hoest_problem_p_tester {
    private static double distance(final int x0, final int y0, final int x1, final int y1, final int z1){
        return (Math.pow(x0-x1, 2) + Math.pow(y0-y1, 2) + Math.pow(z1, 2));
    }
    
    public static void main(String[] args) {
        Random r = new Random();
        
        try {
            FileWriter myWriter = new FileWriter("testfile.txt",StandardCharsets.US_ASCII);
            
            for(int i = 0; i < 100; i++){
                for(int j = 0; j < 100; j++){
                    int z = r.nextInt(100), n = 10;
                    double d1 = distance(0,0,i,j,z), d2 = distance(100,0,i,j,z), d3 = distance(50,100,i,j,z);
                    
                    myWriter.write("" + n + "\n");
                    myWriter.write("" + (int) d1 + "\n");
                    myWriter.write("" + (int) d2 + "\n");
                    myWriter.write("" + (int) d3 + "\n");
                }
            }
            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}