import java.util.Scanner;

public class Questão4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe a temperatura medida no termometro:");
        int temperatura = scanner.nextInt();
        
        if  (temperatura >= 37){
            System.out.println("Você está com febre. Por favor, consulte um médico.");
        }
        else{
            System.out.println("Você está com a temperatura normal." );
        }
        scanner.close();
    }
    
}


