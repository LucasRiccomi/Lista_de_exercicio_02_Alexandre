import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
  {
    int fatorial = 1;
    int i; 
    int numero;

    Scanner input = new Scanner(System.in);
    System.out.print("Informe um número: ");
    numero = input.nextInt();
    input.close();
    
    for(i = 1; i <= numero ; i = i + 1){
    fatorial *= i; 
    }
   
    System.out.printf("%d! = %d", numero, fatorial);
  }

}