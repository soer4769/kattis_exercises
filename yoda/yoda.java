import java.util.Scanner;

public class yoda {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            String a = scanner.next(), b = scanner.next(), aa = "", bb = "";
            int lmax = Math.max(a.length(),b.length()), ca, cb;
            a = String.format("%0"+lmax+"d",Integer.parseInt(a));
            b = String.format("%0"+lmax+"d",Integer.parseInt(b));
            
            for(int i = 0; i < lmax; i++){
                ca = Character.getNumericValue(a.charAt(i));
                cb = Character.getNumericValue(b.charAt(i));
                
                if(ca >= cb){
                    aa += a.charAt(i);
                }
                
                if(cb >= ca){
                    bb += b.charAt(i);
                }
            }

            System.out.println(aa.length() == 0 ? "YODA" : Integer.parseInt(aa));
            System.out.println(bb.length() == 0 ? "YODA" : Integer.parseInt(bb));
        }
    }
}