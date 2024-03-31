import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o Primeiro numero:");
        int num1 = scanner.nextInt();  
        
        System.out.println("Informe o segundo numero:" );
        double num2 = scanner.nextDouble();  
        
        if (num1 > num2){
            System.out.printf("%d é maior que %f", num1, num2); 
        }else{  
            System.out.printf("%f é maior  que %d", num2, num1); 
        }        
    scanner.close();
    }
}
