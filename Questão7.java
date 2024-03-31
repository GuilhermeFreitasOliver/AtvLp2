import java.util.Scanner;

public class Questão7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso em quilogramas:");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura em metros:");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc > 30) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Você não está obeso.");
        }
        scanner.close();
    }
}
