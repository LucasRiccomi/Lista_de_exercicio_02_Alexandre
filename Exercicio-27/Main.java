import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade (em Kg) de morangos comprados: ");
        double qtdMorango = input.nextDouble();
        
        System.out.print("Digite a quantidade (em Kg) de maçãs compradas: ");
        double qtdMaca = input.nextDouble();
        
        double precoMorango, precoMaca;
        if (qtdMorango <= 5) {
            precoMorango = qtdMorango * 2.5;
        } else {
            precoMorango = qtdMorango * 2.2;
        }
        
        if (qtdMaca <= 5) {
            precoMaca = qtdMaca * 1.8;
        } else {
            precoMaca = qtdMaca * 1.5;
        }
        
        double total = precoMorango + precoMaca;
        if (total > 25 || qtdMorango + qtdMaca > 8) {
            total *= 0.9; // desconto de 10%
        }
        
        System.out.printf("Valor a ser pago: R$ %.2f", total);
        
        input.close();
    }
}
