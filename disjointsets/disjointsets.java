import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;

public class disjointsets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        Set<Set<Integer>> sets = new HashSet<>();

        for(int i = 0; i < n; i++){
            sets.add(Set.of(i));
        }

        for(int j = 0; j < m; j++){
            int a = scanner.nextInt(), s = scanner.nextInt(), t = scanner.nextInt();
            Set<Integer> u1 = new HashSet<>(), u2 = new HashSet<>();

            for(Set<Integer> k : sets){
                if(k.contains(s)){
                    u1 = k;
                } if(k.contains(t)){
                    u2 = k;
                }
            }

            if(a == 0){
                //System.out.println((u1 == u2) ? 1 : 0);
            } else if(a == 1 || a == 2 && u1.size() == 1){
                sets.remove(u1);
                sets.remove(u2);
                Set<Integer> u3 = new HashSet<>();
                u3.addAll(u1);
                u3.addAll(u2);
                sets.add(u3);
            } else {
                //System.out.println("sets: " + sets);
                //System.out.println("u1: " + u1);
                //System.out.println("u2: " + u2);
                sets.remove(u2);
                u1.remove(s);
                Set<Integer> u3 = new HashSet<>();
                u3.addAll(u2);
                u3.add(s);
                sets.add(u3);
            }
            System.out.println(j + ": " + sets);
            scanner.nextLine();
        }
    }
}
