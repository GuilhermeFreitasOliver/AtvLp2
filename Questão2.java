import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância a ser percorrida (em km):");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o preço do litro da gasolina (em R$):");
        double precoGasolina = scanner.nextDouble();

        double consumoMedio = 12.0;
        double quantidadeGasolina = distancia / consumoMedio;
        double custoViagem = quantidadeGasolina * precoGasolina;

        System.out.printf("Quantidade de gasolina necessária: %.2f litros\n", quantidadeGasolina);
        System.out.printf("Custo total da viagem: R$ %.2f\n", custoViagem);

        scanner.close();
    }
}
