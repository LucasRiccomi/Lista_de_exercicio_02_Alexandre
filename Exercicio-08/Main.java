import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        int mes;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número referente ao mês requerente: ");
        mes = input.nextInt();
        System.out.println("");
        input.close();

        switch(mes){
         case 1: System.out.println("Mês: Janeiro - Estação: Verão");
         break;
         case 2: System.out.println("Mes: Fevereiro - Estação: Verão");
         break;
         case 3: System.out.println("Mês: Março - Estação: Verão");
         break;
         case 4: System.out.println("Mês: Abril - Estação: Outono");
         break;
         case 5: System.out.println("Mês: Maio - Estação: Outono");
         break;
         case 6: System.out.println("Mês: Junho - Estação: Outono");
         break;
         case 7: System.out.println("Mês: Julho - Estação: Inverno");
         break;
         case 8: System.out.println("Mês: Agosto - Estação: Inverno");
         break;
         case 9: System.out.println("Mês: Setembro - Estação: Inverno");
         break;
         case 10: System.out.println("Mês: Outubro - Estação: Primavera");
         break;
         case 11: System.out.println("Mês: Novembro - Estação: Primavera");
         break;
         case 12: System.out.println("Mês: Dezembro - Estação: Primavera");
         break;
        }
    }   
}