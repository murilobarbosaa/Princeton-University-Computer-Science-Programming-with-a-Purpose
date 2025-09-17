import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        boolean check = a * a + b * b == c * c;

        System.out.println(check);

        scanner.close();
    }
}