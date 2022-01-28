import java.util.Scanner;

public class prozor {
    public static int[] find_marker(int r, int s, int k, String p){
        int[] pos = null;
        
        for(int i = 0; i < (r-k+1); i++){
            for(int j = 0; j < (s-k+1); j++){
                int flies = 0;
                
                for(int m = 0; m < k; m++){
                    for(int n = 0; n < k; n++){
                        if(!(m == 0 || n == 0 || m == (k-1) || n == (k-1)) && p.charAt(i*s+j+m*s+n) == '*'){
                            flies++;
                        }
                    }
                }
                
                if(pos == null || pos[2] < flies){
                    pos = new int[]{j,i,flies};
                }
            }
        }
        
        return pos;
    }
    
    public static String place_racket(int x, int y, int r, int s, int k, String p){
        String q = "";
        
        for(int i = 0; i < p.length(); i++){
            q += (i % s == 0 ? "\n" : "");
            
            if(i == (y*s+x) || i == (y*s+x+k-1) || i == ((y+k-1)*s+x) || i == ((y+k-1)*s+x+k-1)){
                q += "+";
                continue;
            }
            
            else if(i > (y*s+x) && i < (y*s+x+k-1) || i > ((y+k-1)*s+x) && i < ((y+k-1)*s+x+k-1)){
                q += "-";
                continue;
            }
            
            else if(i > ((y+1)*s+(x-1)) && i < ((y+k-1)*s) && (x == (i - i / s * s) || (x+k-1) == (i - i / s * s))){
                q += "|";
                continue;
            }
            
            q += p.charAt(i);
        }
        
        return q.trim();
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            int r = scanner.nextInt(), s = scanner.nextInt(), k = scanner.nextInt();
            String p = "";
            
            for(int i = 0; i < r; i++){
                p += scanner.next();
            }
            
            int[] pos = find_marker(r,s,k,p);
            p = place_racket(pos[0],pos[1],r,s,k,p);
            
            //System.out.println("x: " + pos[0] + ",y:" + pos[1] + ",flies: " + pos[2]);
            System.out.println(pos[2] + "\n" + p);
        }
    }
}