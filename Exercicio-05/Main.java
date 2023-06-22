import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        String nome;
        String sobrenome;
        String naturalidade;
        char opcao;
        int idade;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = input.nextLine();

        System.out.print("Digite sua idade (anos): ");
        idade = input.nextInt();

        input.nextLine();

        System.out.print("Digite sua naturalidade: ");
        naturalidade = input.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N) ");
        opcao = input.nextLine().charAt(0);
        input.close();
        
      
        if (opcao == 'S') {
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente Novamente");
        }

    }  
}