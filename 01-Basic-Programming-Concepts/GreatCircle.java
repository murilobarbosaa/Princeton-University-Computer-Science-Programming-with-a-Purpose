import java.util.Locale;
import java.util.Scanner;

public class GreatCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double x1 = Math.toRadians(scanner.nextDouble());
        double y1 = Math.toRadians(scanner.nextDouble());
        double x2 = Math.toRadians(scanner.nextDouble());
        double y2 = Math.toRadians(scanner.nextDouble());

        double r = 6371;
        double distance = 2 * r * Math.asin(Math.sqrt((Math.pow(Math.sin((x2 - x1)/2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2) , 2))));
        
        System.out.printf(Locale.US, "%.12f kilometers", distance);

        scanner.close();
    }
}