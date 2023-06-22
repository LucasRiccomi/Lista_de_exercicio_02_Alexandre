import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " é um número par.");
        } else {
            System.out.println(num + " é um número ímpar.");
        }
        input.close();
    }
}