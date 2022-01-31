import java.util.HashSet;
import java.util.Arrays;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicprogramming1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] infoLine = reader.readLine().split(" ");
        int N = Integer.parseInt(infoLine[0]), t = Integer.parseInt(infoLine[1]);
        String[] A = reader.readLine().split(" ");

        switch(t){
            case 1:
                System.out.println(7);
                break;
            case 2:
                long A1 = Long.parseLong(A[0]), A2 = Long.parseLong(A[1]);
                if(A1 > A2){
                    System.out.println("Bigger");
                } else if(A1 == A2){
                    System.out.println("Equal");
                } else {
                    System.out.println("Smaller");
                }
                break;
            case 3:
                long A_0 = Long.parseLong(A[0]), A_1 = Long.parseLong(A[1]), A_2 = Long.parseLong(A[2]);
                System.out.println(Math.max(Math.min(A_0,A_1),Math.min(Math.max(A_0,A_1),A_2)));
                break;
            case 4:
            case 5:
                BigInteger sum = new BigInteger("0");
                for(String currInt : A){
                    BigInteger A0 = new BigInteger(currInt);

                    if(A0.mod(new BigInteger("2")).equals(BigInteger.ZERO) && t == 5 || t == 4){
                        sum = sum.add(A0);
                    }
                }
                System.out.println(sum.toString());
                break;
            case 6:
                String alpha = "abcdefghijklmnopqrstuvwxyz";
                char[] alphaChars = new char[N];
                for(int i = 0; i < N; i++){
                    alphaChars[i] = alpha.charAt(Integer.parseInt(A[i])%26);
                }
                System.out.println(String.valueOf(alphaChars));
                break;
            case 7:
                HashSet<Integer> containsArr = new HashSet();
                int p = 0;
                while(true){
                    if(p > (N-1) || p < 0){
                        System.out.println("Out");
                        break;
                    } else if(p == (N-1)){
                        System.out.println("Done");
                        break;
                    } else if(containsArr.contains(p)){
                        System.out.println("Cyclic");
                        break;
                    } else {
                        containsArr.add(p);
                        p = Integer.parseInt(A[p]);
                    }
                }
                break;
        }
    }
}
