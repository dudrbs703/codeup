import java.util.Scanner;

import jdk.internal.jshell.tool.resources.l10n;

/**
 * Print_1466
 */
public class Print_1466 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 2; //scanner.nextInt();
        int b = 3; //scanner.nextInt();
        scanner.close();

        int [][]array = new int[a][b];
        int count = 1;
        int level = b;

        while(level >= 0)
        {
            for(int i=array[level].length-1; i>=0; i--)
            {
                array[i][level] = count++;
            }

            level--;
        }

        for(int i=0; i<array.length;i++)
        {
            for(int j=0; j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}