import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        double nota;

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a nota do aluno (0 a 100): ");
        nota = input.nextDouble();
        input.close();


        if (nota <= 49){
            System.out.println("O conceito do aluno é: Insuficiente");
        }
        else if(nota <= 64){
            System.out.println("O conceito do aluno é: Regular");
        }
        else if(nota <= 84){
            System.out.println("O conceito do aluno é: Bom");
        }
        else{System.out.println("O conceito do aluno é: Otimo");}
    }   
}