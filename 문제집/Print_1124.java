import java.util.Scanner;

/**
 * Print_1124
 */
public class Print_1124 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        scanner.close();

        int c_atomic_weight = 12;
        int h_atomic_weight = 1;
        
        int c = 0;
        int h = 0;
        
    
        System.out.println((8 * c_atomic_weight) + (h * h_atomic_weight));
    }
}