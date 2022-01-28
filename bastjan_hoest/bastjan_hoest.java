import java.util.Scanner;
import java.util.ArrayList;

public class hoest 
{

    //TODO: Start from max width and height (L25).
    //TODO: Once program is done, refactor messy code (DRY, SoC).

    private static Scanner scanner = new Scanner(System.in);
    private static int width = scanner.nextInt();
    private static int height = scanner.nextInt();
    private static int posX = scanner.nextInt();
    private static int posY = scanner.nextInt();

    // fieldMap is temporary testing. Remove when program works.
    private static boolean[][] fieldMap = new boolean[height][width];

    public static void main(String []args)
    {
        fieldMap[posY][posX] = true; 

        // Ændr denne til at starte fra max width og nul height
        
        topRight();        

        Loop();

        if(posY != 0)
        {
            System.out.print('>');
            System.out.print('>');
            while(posY != 0)
            {
                posY--;
                System.out.print('^');
                fieldMap[posY][posX] = true;
            }
        }
    }

    public static void topRight()
    {
        System.out.print('>');
        while((posX + 1) != width)
        {
            posX++;
            System.out.print('^');
            fieldMap[posY][posX] = true;

        }

        System.out.print('<');
        while(posY != 0)
        {
            posY--;
            System.out.print('^');
            fieldMap[posY][posX] = true;
        }

        System.out.print('>');
        System.out.print('>');
    }

    public static void Loop()
    {
        for(int x = posX; x >= 0; x--)
        {   
            if(x % 2 == 0)
            {
                //for(int y = posY; y < height - 1; y++)
                while(posY != height - 1)
                {
                    System.out.print('^');
                    posY++;
                    fieldMap[posY][posX] = true;
                }
            }
            else
            {
                //for(int y = posY; y > 1; y--)
                while(posY != 0)
                {
                    posY--;
                    System.out.print('^');
                    fieldMap[posY][posX] = true;
                }
            }
            
            if(x != 0)
            {
                if(x % 2 == 0) System.out.print('>'); else System.out.print('<');
                System.out.print('^');
                posX--;
                fieldMap[posY][posX] = true;
                if(x % 2 == 0) System.out.print('>'); else System.out.print('<');
            }
        }   
    }
}



