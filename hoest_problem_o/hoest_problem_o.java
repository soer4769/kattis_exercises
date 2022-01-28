import java.util.Scanner;

public class hoest_problem_o {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNext()){
            boolean[][] board = new boolean[200][200];
            int x = 100, y = 100, dir = 1, min_x = 100, min_y = 100, max_x = 100, max_y = 100;
            board[100][100] = true;
            
            for(char character : scanner.nextLine().toCharArray()){
                switch(character){
                    case '>':
                        dir = (4 + dir - 1) % 4;
                        break;
                    case '<':
                        dir = (4 + dir + 1) % 4;
                        break;
                    case '^':
                        x += ((dir % 2 == 0) ? (dir-1)*-1 : 0);
                        y -= ((dir % 2 == 1) ? (dir-2)*-1 : 0);
                        board[x][y] = true;
                        
                        min_x = Math.min(min_x,x);
                        min_y = Math.min(min_y,y);
                        max_x = Math.max(max_x,x);
                        max_y = Math.max(max_y,y);
                        break;
                }
            }
            
            for(int i = min_y; i <= max_y; i++){
                for(int j = min_x; j <= max_x; j++){
                    System.out.print(board[j][i] ? '#' : ' ');
                }
                
                System.out.println();
            }
            
            System.out.println(Math.abs(min_x-max_x-1) + "X" + Math.abs(min_y-max_y-1) + "\n");
        }
    }
}