import java.util.Scanner;

/**
 * Print_1081
 */
public class Print_1081 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();;
        
        for(int i=1; i<=a;i++)
        {
            for(int j=1; j<=b; j++)
            {
                System.out.println(i+" "+j);
            }
        }
        scanner.close();
    }
}