import java.util.Scanner;

public class Questão6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da primeira prova:");
        double prova1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double prova2 = scanner.nextDouble();

        System.out.println("Digite a nota do trabalho:");
        double trabalho = scanner.nextDouble();

        double media = (prova1 + prova2 + trabalho) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
