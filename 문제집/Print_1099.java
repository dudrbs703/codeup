import java.util.Scanner;

import org.graalvm.compiler.asm.sparc.SPARCAssembler.Br;

/**
 * Print_1099
 */
public class Print_1099 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        //int [][]board = new int[height][width];
        int [][]board = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 0 ,1, 1, 1, 0, 0, 0 ,1},
            {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0 ,0, 0, 0, 1, 0 ,1},
            {1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 2, 1, 0, 1},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0 ,0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1,}
        };
        /*
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                board[i][j] = scanner.nextInt();
            }
        }*/

        int x = 1;
        int y = 1;

        while(true)
        {
            if(board[x][y] == 2 ) break;
            if(board[x][y++] == 0) board[x][y] = 9;
            //if(board[x])
        }

        scanner.close();

        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}