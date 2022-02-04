import java.util.Scanner;
import java.util.Arrays;

public class disjointsets {
    public static class DS {
        private int n;
        private int[] id;

        public String print(){
            return Arrays.toString(id);
        }

        private int find(int p){
            if(id[p] != p){
                p = find(id[p]);
            }
            return p;
        }

        public void union(int p, int q){
            for(int i = 0; i < n; i++){
                if(id[i] == find(p)){
                    id[i] = find(q);
                }
            }
        }

        public boolean query(int p, int q){
            return find(p) == find(q);
        }

        public void move(int p, int q){
            id[p] = find(q);
        }

        DS(int n){
            this.n = n;
            this.id = new int[n];

            for(int i = 0; i < n; i++){
                id[i] = i;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        DS set = new DS(m);
       // System.out.println(set.print());

        for(int i = 0; i < n; i++){
            switch(scanner.nextInt()){
                case 0:
                    boolean connected = set.query(scanner.nextInt(),scanner.nextInt());
                    //System.out.println(connected ? 1 : 0);
                    break;
                case 1:
                    set.union(scanner.nextInt(),scanner.nextInt());
                    System.out.println(set.print());
                    break;
                case 2:
                    set.move(scanner.nextInt(),scanner.nextInt());
                    break;
            }
        }

    }
}
