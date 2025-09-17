import java.util.Locale;
import java.util.Scanner;

public class CMYKtoRGB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double cyan = scanner.nextDouble();
        double magenta = scanner.nextDouble();
        double yellow = scanner.nextDouble();
        double black = scanner.nextDouble();

        double white = 1 - black;
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        System.out.printf("red   = %.0f%n", red);
        System.out.printf("green = %.0f%n", green);
        System.out.printf("blue  = %.0f%n", blue);

        scanner.close();
    }
}