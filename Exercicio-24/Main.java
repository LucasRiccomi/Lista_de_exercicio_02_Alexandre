import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = input.nextInt();
        
        double resultado = 0;
        String tipo1 = "", tipo2 = "";
        if (opcao == 1) {
            resultado = num1 + num2;
            System.out.println("Resultado da soma: " + resultado);
        } else if (opcao == 2) {
            resultado = num1 - num2;
            System.out.println("Resultado da subtração: " + resultado);
        } else if (opcao == 3) {
            resultado = num1 * num2;
            System.out.println("Resultado da multiplicação: " + resultado);
        } else if (opcao == 4) {
            resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } else {
            System.out.println("Opção inválida.");
        }
        
        if (num1 % 2 == 0) {
            tipo1 += "par, ";
        } else {
            tipo1 += "ímpar, ";
        }
        
        if (num1 >= 0) {
            tipo1 += "positivo, ";
        } else {
            tipo1 += "negativo, ";
        }
        
        if (num1 == Math.floor(num1)) {
            tipo1 += "inteiro.";
        } else {
            tipo1 += "decimal.";
        }
        
        if (num2 % 2 == 0) {
            tipo2 += "par, ";
        } else {
            tipo2 += "ímpar, ";
        }
        
        if (num2 >= 0) {
            tipo2 += "positivo, ";
        } else {
            tipo2 += "negativo, ";
        }
        
        if (num2 == Math.floor(num2)) {
            tipo2 += "inteiro.";
        } else {
            tipo2 += "decimal.";
        }
        
        System.out.println("O primeiro número é " + tipo1);
        System.out.println("O segundo número é " + tipo2);
        
        input.close();
    }
}
