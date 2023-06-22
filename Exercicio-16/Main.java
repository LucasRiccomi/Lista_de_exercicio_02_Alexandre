import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {   
        int numero;

        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Informe um número: ");
            numero = input.nextInt();
        }
        while (numero>=0);
        input.close();
        
        System.out.println("Número informado é menor que 0"); 
    } 
}