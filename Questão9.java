import java.util.Scanner;

public class Questão9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da hora de aula:");
        double valorHoraAula = scanner.nextDouble();

        System.out.println("Informe o número de horas trabalhadas no mês:");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Informe o percentual de desconto do INSS (ex: 8,5 para 8,5%):");
        double percentualINSS = scanner.nextDouble();

        double salarioBruto = valorHoraAula * horasTrabalhadas;

        double descontoINSS = salarioBruto * (percentualINSS / 100.0);

        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Desconto do INSS: R$" + descontoINSS);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
