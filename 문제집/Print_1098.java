import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/**
 * Print_1098
 */
public class Print_1098 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int [][]board = new int[width+1][height+1];
        
        int stick = scanner.nextInt();

        for(int i=0; i<stick; i++)
        {
            int stick_length = scanner.nextInt();
            int direction = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
           

            if(direction == 0)
            {
                // 가로
                for(int j=0; j<stick_length; j++)
                {
                    board[x][y+j] = 1;
                }
            } 
            
            if(direction == 1)
            {
                //아래
                for(int j=0; j<stick_length; j++)
                {
                    board[x+j][y] = 1;
                } 
            }
            
        }      
        scanner.close();        
        //reader.close();

        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1; i<board.length; i++)
        {
            for(int j=1; j<board.length; j++)
            {
                //writer.write(board[i][j]+" ");
                System.out.print(board[i][j]+" ");
            }

            System.out.println();
            //writer.newLine();
        }

        //writer.flush();
    }
}