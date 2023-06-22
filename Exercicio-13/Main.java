public class Main
{
    public static void main(String[] args)
    {  
     int i = 1;
     int soma=0;

        while (i <= 100){
        soma = i + soma;
        i= i + 1;
        }
     
     System.out.print(soma);

    }
}