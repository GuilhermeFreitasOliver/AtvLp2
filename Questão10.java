import java.util.Scanner;

public class Questão10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, soma;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();
        
        soma = valor1 + valor2;

        if (soma > 10) {
            System.out.println("A soma dos valores é maior que 10: " + soma);
        } else {
            System.out.println("A soma dos valores não é maior que 10.");
        }
        scanner.close();
    }
}
