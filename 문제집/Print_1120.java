import java.util.Scanner;

/**
 * Print_1120
 */
public class Print_1120 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        scanner.close();

        System.out.println(String.format("%.2f", (a+b+c)/3));
    }
}