import java.util.Scanner;

/**
 * Print_1552
 */
public class Print_1552 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        f(scanner.nextDouble());
        scanner.close();
    }

    public static void f(double a)
    {
        StringBuilder builder = new StringBuilder();
        char []tmp = String.valueOf(a).toCharArray();        
        int position = String.valueOf(a).indexOf((int)'.');

        for(int i=position+1; i<tmp.length; i++)
        {
            builder.append(String.valueOf(tmp[i]));
        }

        System.out.printf("%.14l", Double.parseDouble(builder.toString()));
        //System.out.println(Double.parseDouble(builder.toString()));

        /*
        for(int i=builder.length(); i<14; i++)
        {
            builder.append("0");
        }

        System.out.println("0."+builder.toString());*/
    }
}