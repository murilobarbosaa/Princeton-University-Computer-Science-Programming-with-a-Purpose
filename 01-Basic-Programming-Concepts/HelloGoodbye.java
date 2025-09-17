import java.util.Scanner;

public class HelloGoodbye {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome1 = scanner.next();
        String nome2 = scanner.next();

        System.out.println("Hello " + nome1 + " and " + nome2 + ".");
        System.out.println("Godbye " + nome2 + " and " + nome1 + ".");

        scanner.close();
    }
}