import java.util.Scanner;

public class Questão11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, soma, resultado;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        soma = valor1 + valor2;
        
        if (soma > 10) {
            resultado = soma + 5;
        } else {
            resultado = soma - 7;
        }
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}