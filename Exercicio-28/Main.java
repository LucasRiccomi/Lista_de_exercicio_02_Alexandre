import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o tipo de carne desejado (F-file duplo, A-alcatra, P-picanha): ");
        String tipoCarne = input.next().toUpperCase();
        
        System.out.print("Digite a quantidade (em Kg) de carne desejada: ");
        double qtdCarne = input.nextDouble();
        
        double precoKg, precoTotal;
        if (tipoCarne.equals("F")) {
            if (qtdCarne <= 5) {
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }
        } else if (tipoCarne.equals("A")) {
            if (qtdCarne <= 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipoCarne.equals("P")) {
            if (qtdCarne <= 5) {
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        } else {
            System.out.println("Tipo de carne inválido.");
            System.exit(0);
            return;
        }
        
        precoTotal = qtdCarne * precoKg;
        
        System.out.print("Pagamento com cartão Tabajara? (S-sim, N-não): ");
        String tipoPagamento = input.next().toUpperCase();
        
        double desconto = 0;
        if (tipoPagamento.equals("S")) {
            desconto = precoTotal * 0.05;
        }
        
        double precoFinal = precoTotal - desconto;
        
        System.out.println("+----------------------+");
        System.out.printf("| Tipo de carne: %s     |\n", tipoCarne);
        System.out.printf("| Quantidade: %.2f Kg   |\n", qtdCarne);
        System.out.printf("| Preço total: R$ %.2f  |\n", precoTotal);
        System.out.printf("| Tipo de pagamento: %s|\n", tipoPagamento.equals("S") ? "Cartão Tabajara" : "Não cartão");
        System.out.printf("| Valor do desconto: R$ %.2f|\n", desconto);
        System.out.printf("| Valor a pagar: R$ %.2f   |\n", precoFinal);
        System.out.println("+----------------------+");
        
        input.close();
    }
}
