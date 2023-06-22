import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        int numero; 
        int i= 1;
        int resultado;
        int j = 1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número positivo: " );
        numero = input.nextInt();
        input.close();
        
        for (i = 1; i <= numero; i++) {
         System.out.println("Tabuada do número " + i + " : ");
        
        for(j = 1; j <= 10; j++){
            resultado = i * j;
         System.out.println(i + " x " + j + " = " + resultado );
        }   
      }      
    }    
}
    
