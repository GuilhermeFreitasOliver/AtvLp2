import java.util.Scanner;

public class Questão8 {
    public static void main(String[] args) {
        
        double PI = 3.1416;

        System.out.println("Digite o valor do raio:");
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();

        double area = PI * Math.pow(raio, 2);

        System.out.println("A área da circunferência é: " + area);

        scanner.close();
    }
}
