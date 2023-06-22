import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        int numeroInteiro;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        numeroInteiro = input.nextInt();
        input.close();


        if (numeroInteiro % 2 == 0){
            System.out.println("");
            System.out.println("O número informado é Par");
        }
        else {System.out.println("O número informado é Impar"); 
        }

        if (numeroInteiro >= 0){
            System.out.println("O número informado é Positivo");
        }
        else {System.out.println("O número informado é Negativo");
        }        
    }    
}