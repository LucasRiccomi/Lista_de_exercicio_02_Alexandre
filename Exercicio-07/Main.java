import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        double totalDiaria;
        double diaria = 60;
        double taxaServico;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o total da diária: ");
        totalDiaria = input.nextDouble();
        System.out.println("");
        input.close();

        if (totalDiaria > 15){
           taxaServico = 5.50;
            
        }
        else if (totalDiaria == 15){
           taxaServico = 6;
        }
        else{
            taxaServico = 8;
        }

        total = totalDiaria * (diaria + taxaServico);
        System.out.println("O valor total da hospedagem é: R$" +total);
    }     
}