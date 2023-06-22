import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        double cargaMaxima;
        int maximaPessoas; 
        double peso;
        int pessoas = 0;
        double cargaAtual = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe a carga máxima do elevador em KG: ");
        cargaMaxima = input.nextDouble();
        System.out.print("Informe a quantidade máxima de pessoas: ");
        maximaPessoas = input.nextInt();
        System.out.println("");
        input.close();

        do{
            System.out.printf("Digite o peso da pessoa %d em KG: ", pessoas+1);
            peso = input.nextDouble();
            
            if(cargaAtual + peso > cargaMaxima){
              System.out.println("Carga Máxima atingida");
              break;
            }

            cargaAtual = cargaAtual + peso;
            pessoas = pessoas +1;
        } 
        while (pessoas < maximaPessoas);

        System.out.printf("O elevador está com %.2f Kg de carga e %d de pessoas", cargaAtual, pessoas);     
    }    
}