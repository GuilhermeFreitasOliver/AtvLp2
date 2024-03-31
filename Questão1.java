import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        int horasTrabalhadas = scanner.nextInt();

        double salario = horasTrabalhadas * 20.00;

        System.out.println("O salário do operário é: R$" + salario);

        scanner.close();
    }
}
