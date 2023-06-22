import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número de litros vendidos: ");
        double litros = input.nextDouble();
        
        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        String tipo = input.next().toUpperCase();
        
        double preco = 0;
        if (tipo.equals("G")) {
            if (litros <= 20) {
                preco = litros * 2.5 * 0.96; // desconto de 4%
            } else {
                preco = litros * 2.5 * 0.94; // desconto de 6%
            }
        } else if (tipo.equals("A")) {
            if (litros <= 20) {
                preco = litros * 1.9 * 0.97; // desconto de 3%
            } else {
                preco = litros * 1.9 * 0.95; // desconto de 5%
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            System.exit(0);
        }
        
        System.out.printf("Valor a ser pago: R$ %.2f", preco);
        
        input.close();
    }
}
