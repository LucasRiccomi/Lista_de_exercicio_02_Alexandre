import java.util.Scanner; 

public class Main
{
    public static void main(String[] args) 
    {
        double volume;
        int segundos = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o volume inicial do gás em CM³: ");
        volume = input.nextInt();
        input.close();

        while(volume <= 1000){
            volume = volume * 2;
            segundos = segundos + 1;
        }
        System.out.printf("O volume ultrapassou 1000 cm³ em %d segundos", segundos);        
    }    
}