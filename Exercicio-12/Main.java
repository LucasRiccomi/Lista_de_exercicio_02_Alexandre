public class Main
{    
    public static void main(String[] args) 
    {
        int numero = 0;
    
        do {
            numero += 2 ;
            if ( numero % 2 == 0){
                
                System.out.println(numero);
            }
        }while (numero % 7 != 0);

        System.out.printf("O Múltiplo par de 7 é %d.", numero);
    }
}