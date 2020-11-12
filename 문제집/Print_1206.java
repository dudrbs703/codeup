import java.util.Scanner;

/**
 * Print_1206
 */
public class Print_1206 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(b%a == 0)
        {
            System.out.println(a+"*"+(b/a)+"="+b);
        } else System.out.println("none");
    }
}