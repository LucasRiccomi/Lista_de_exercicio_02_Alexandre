import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        int a;
        int b;
       

        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: " );
        a= input.nextInt();
        System.out.print("Informe outro número: " );
        b= input.nextInt();
        input.close();
        System.out.println("");
        

        if (a % b == 0 || b % a == 0){
            System.out.println("Os números são múltiplos");

        }
        else{
            System.out.println("Os números não são múltiplos");
        }
        
    }
    
}