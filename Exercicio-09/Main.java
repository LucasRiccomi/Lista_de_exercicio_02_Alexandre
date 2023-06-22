import java.util.Scanner;


public class Main
{
    public static void main(String[] args) 
    {
        double valorVenda;
        double total;
        int condicao;
       

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor da venda: R$");
        valorVenda = input.nextDouble();
        
        System.out.println("Escolha uma das opções abaixo " );
        System.out.println("1 - Venda a vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de Débito");
        System.out.println("6 - venda com cartão de Crédito");
        condicao = input.nextInt();
        System.out.println("Opção desejada: "+ condicao);
        input.close();

        
        switch(condicao){
         case 1: total = valorVenda * 0.9;
         break;
         case 2: total = valorVenda * 0.95;
         break;
         case 3: total = valorVenda;
         break;
         case 4: total = valorVenda * 1.05;
         break;
         case 5: total = valorVenda * 0.92;
         break;
         case 6: total = valorVenda * 0.93;
         default:
         System.out.println("Opção inválida");
         return;
        }

        System.out.println("Total da venda: R$" +total);      
    } 
}